package ma.znagui.quiz.service;

import ma.znagui.quiz.dto.quizAssignement.QuizAssignementCreateDTO;
import ma.znagui.quiz.dto.quizAssignement.QuizAssignementResponseDTO;

public interface QuizAssignementService {
    QuizAssignementResponseDTO assigneQuizToStudent(QuizAssignementCreateDTO dto);
    QuizAssignementResponseDTO getAssignement(Long id);
//    QuizAssignementResponseDTO addScoreAndResultToAssignemnt()
}
