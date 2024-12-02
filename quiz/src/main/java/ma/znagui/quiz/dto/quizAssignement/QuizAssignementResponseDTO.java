package ma.znagui.quiz.dto.quizAssignement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.dto.answerValidation.AnswerValidationEmbdedDTO;
import ma.znagui.quiz.dto.quiz.QuizEmbdedDTO;
import ma.znagui.quiz.dto.student.StudentEmbdedDTO;
import ma.znagui.quiz.entity.AnswerValidation;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
public class QuizAssignementResponseDTO {
    private Long id;
    private String reason;
    private LocalDate startDate;
    private LocalDate endDate;
    private int attempt;
    private Double score;
    private Double result;
    private QuizEmbdedDTO quiz;
    private StudentEmbdedDTO student;
    
    private List<AnswerValidationEmbdedDTO> answerValidations;

}
