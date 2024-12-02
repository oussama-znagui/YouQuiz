package ma.znagui.quiz.service.impl;

import ma.znagui.quiz.dto.answerValidation.AnswerValidationCreateDTO;
import ma.znagui.quiz.dto.answerValidation.AnswerValidationResponseDTO;
import ma.znagui.quiz.entity.*;
import ma.znagui.quiz.exception.QuestionDoesNotExistInQuiz;
import ma.znagui.quiz.mapper.AnswerValidationMapper;
import ma.znagui.quiz.repository.AnswerValidationRepository;
import ma.znagui.quiz.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerValidationServiceImpl implements AnswerValidationService {
    @Autowired
    AnswerValidationMapper mapper;
    @Autowired
    AnswerValidationRepository repository;
    @Autowired
    QuizAssignementService quizAssignementService;
    @Autowired
    QuestionService questionService;
    @Autowired
    QuestionAnswerService questionAnswerService;
    @Autowired
    AnswerService answerService;

    public AnswerValidationResponseDTO addAnswerValidation(AnswerValidationCreateDTO dto) {
        AnswerValidation answerValidation = mapper.createDTOtoAnswerValidation(dto);

        QuizAssignement quizAssignement = quizAssignementService.getEntityByID(answerValidation.getQuizAssignement().getId());
        Question question = questionService.getQuestionEntityByID(answerValidation.getQuestion().getId());

      int exist = (int) quizAssignement.getQuiz().getQuizQuestions().stream().filter(quizQuestion -> quizQuestion.getId().getQuesionID() == question.getId()).count();
      if (exist == 0){
          throw new QuestionDoesNotExistInQuiz(question.getId(),quizAssignement.getQuiz().getId());
      }

        QuestionAnswer questionAnswer =questionAnswerService.getEntityByKey(new QuestionAnswerKey(question.getId(),answerValidation.getAnswer().getId()));

      answerValidation.setPoints(questionAnswer.getPoints());

      AnswerValidation created = repository.save(answerValidation);
      created.setQuestion(question);
      created.setQuizAssignement(quizAssignement);
      created.setAnswer(answerService.getAnswerEntityByID(answerValidation.getAnswer().getId()));

      quizAssignementService.addScoreAndResultToAssignemnt(quizAssignement.getId(),created.getPoints());



        return mapper.answerValidationToResponseDTO(created);
    }

    public AnswerValidationResponseDTO getAnswerValidation(Long id) {
        return null;
    }
}
