package ma.znagui.quiz.service;

import ma.znagui.quiz.dto.quiz.QuizCreateDTO;
import ma.znagui.quiz.dto.quiz.QuizResponseDTO;
import ma.znagui.quiz.entity.Quiz;

public interface QuizService {
    QuizResponseDTO createQuiz(QuizCreateDTO dto);
    QuizResponseDTO getOneQuiz(Long id);

}
