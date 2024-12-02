package ma.znagui.quiz.service;

import ma.znagui.quiz.dto.quizAssignement.QuizAssignementCreateDTO;
import ma.znagui.quiz.dto.quizAssignement.QuizAssignementResponseDTO;
import ma.znagui.quiz.entity.QuizAssignement;

public interface QuizAssignementService {
    QuizAssignementResponseDTO assigneQuizToStudent(QuizAssignementCreateDTO dto);
    QuizAssignementResponseDTO getAssignement(Long id);
    void addScoreAndResultToAssignemnt(Long id,Double points);

    QuizAssignement getEntityByID(Long id);
}
