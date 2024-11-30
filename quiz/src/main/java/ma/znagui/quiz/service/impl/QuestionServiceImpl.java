package ma.znagui.quiz.service.impl;

import ma.znagui.quiz.dto.question.QuesionCreateDTO;
import ma.znagui.quiz.dto.question.QuestionResponseDTO;
import ma.znagui.quiz.mapper.QuestionMapper;
import ma.znagui.quiz.mapper.StudentMapper;
import ma.znagui.quiz.repository.QuestionRepository;
import ma.znagui.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionMapper mapper;
    @Autowired
    QuestionRepository repository;

    public QuestionResponseDTO createQuesion(QuesionCreateDTO dto) {

        return null;
    }

    public QuestionResponseDTO getOneQuestion(Long id) {
        return null;
    }
}
