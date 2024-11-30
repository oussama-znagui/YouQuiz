package ma.znagui.quiz.service;

import ma.znagui.quiz.dto.question.QuesionCreateDTO;
import ma.znagui.quiz.dto.question.QuestionResponseDTO;

public interface QuestionService {

    QuestionResponseDTO createQuesion(QuesionCreateDTO dto);
    QuestionResponseDTO getOneQuestion(Long id);



}
