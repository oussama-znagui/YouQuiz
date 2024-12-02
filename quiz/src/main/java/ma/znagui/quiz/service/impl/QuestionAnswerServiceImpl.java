package ma.znagui.quiz.service.impl;

import ma.znagui.quiz.dto.questionAnswer.QuestionAnswerCreateDTO;
import ma.znagui.quiz.dto.questionAnswer.QuestionAnswerResponseDTO;
import ma.znagui.quiz.entity.Question;
import ma.znagui.quiz.entity.QuestionAnswer;
import ma.znagui.quiz.entity.QuestionAnswerKey;
import ma.znagui.quiz.exception.*;
import ma.znagui.quiz.mapper.QuestionAnswerMapper;
import ma.znagui.quiz.repository.QuestionAnswerRepository;
import ma.znagui.quiz.service.QuestionAnswerService;
import ma.znagui.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionAnswerServiceImpl implements QuestionAnswerService {
    @Autowired
    QuestionAnswerMapper mapper;
    @Autowired
    QuestionAnswerRepository repository;
    @Autowired
    QuestionService questionService;

    public QuestionAnswerResponseDTO assignQuestionToAnswer(QuestionAnswerCreateDTO dto) {
        QuestionAnswer questionAnswer = mapper.createDTOtoQuestionAnswer(dto);
        Question question = questionService.getQuestionEntityByID(questionAnswer.getId().getQuestionID());


        if(question.getQuestionAnswers().size() == question.getAnswers()){
            throw new MaxQuestionAnswersException(question.getId(),question.getAnswers());
        }


        int wAnswer = (int) question.getQuestionAnswers().stream().filter(questionAnswer1 -> questionAnswer1.getPoints() == 0).count();
        System.out.println(wAnswer);
        if (questionAnswer.getPoints() == 0 && (question.getAnswers() - question.getCorrectAnswers()) == wAnswer){
            throw new MaxWrongQuestionException(question.getId(),(question.getAnswers() - question.getCorrectAnswers()));


        }

        int cAnswer = (int) question.getQuestionAnswers().stream().filter(questionAnswer1 -> questionAnswer1.getPoints() != 0).count();
        System.out.println(cAnswer);
        System.out.println(question.getCorrectAnswers());
        if (questionAnswer.getPoints() != 0 &&  question.getCorrectAnswers() == cAnswer){
           throw new  MaxCorrectAnswerException(question.getId(),question.getCorrectAnswers());

        }

        if (questionAnswer.getPoints() != 0 && (questionAnswer.getPoints() < question.getLevel().getMinPoints() || questionAnswer.getPoints() > question.getLevel().getMaxPoints()) ){
            throw new PointsException(question.getId(),question.getLevel().getMinPoints(),question.getLevel().getMaxPoints(),question.getLevel().getDescription());
        }




        QuestionAnswer created = repository.save(questionAnswer);

        return mapper.questionAnswerToResponseDTO(created);
    }

    public QuestionAnswerResponseDTO getQuestionAnswer(QuestionAnswerKey key) {
        return null;
    }


    public QuestionAnswer getEntityByKey(QuestionAnswerKey key) {
        return repository.findById(key).orElseThrow(() -> new ResourceNotFoundExeption("reponse du questtion",key.getQuestionID(), key.getAnswerID()));
    }
}
