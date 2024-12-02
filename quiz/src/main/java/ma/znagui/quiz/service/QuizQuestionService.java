package ma.znagui.quiz.service;

import ma.znagui.quiz.dto.quizQuestion.QuizQuestionCreateDTO;
import ma.znagui.quiz.dto.quizQuestion.QuizQuestionResponseDTO;

public interface QuizQuestionService {
    QuizQuestionResponseDTO assigneQuetionToQuiz(QuizQuestionCreateDTO dto);
    QuizQuestionResponseDTO getOneQuizQuesion(Long id);

}
