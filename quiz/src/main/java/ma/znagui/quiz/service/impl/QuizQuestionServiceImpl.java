package ma.znagui.quiz.service.impl;

import ma.znagui.quiz.dto.quizQuestion.QuizQuestionCreateDTO;
import ma.znagui.quiz.dto.quizQuestion.QuizQuestionResponseDTO;
import ma.znagui.quiz.entity.Question;
import ma.znagui.quiz.entity.QuizQuestion;
import ma.znagui.quiz.mapper.QuizQuestionMapper;
import ma.znagui.quiz.repository.QuizQuestionRepository;
import ma.znagui.quiz.service.QuestionService;
import ma.znagui.quiz.service.QuizQuestionService;
import ma.znagui.quiz.service.QuizService;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizQuestionServiceImpl implements QuizQuestionService {
    @Autowired
    QuizQuestionRepository repository;
    @Autowired
    QuizQuestionMapper mapper;
    @Autowired
    QuizService quizService;
    @Autowired
    QuestionService questionService;



    public QuizQuestionResponseDTO assigneQuetionToQuiz(QuizQuestionCreateDTO dto) {
        QuizQuestion quizQuestion = mapper.createDTOtoQuestion(dto);



        QuizQuestion created = repository.save(quizQuestion);
        created.setQuiz(quizService.getQuizEntityByID(quizQuestion.getId().getQuizID()));
        created.setQuestion(questionService.getQuestionEntityByID(quizQuestion.getId().getQuesionID()));


        return mapper.questionToResponseDTO(created);

    }

    public QuizQuestionResponseDTO getOneQuizQuesion(Long id) {
        return null;
    }
}
