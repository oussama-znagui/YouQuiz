package ma.znagui.quiz.dto.quizAssignement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.dto.quiz.QuizEmbdedDTO;
import ma.znagui.quiz.dto.student.StudentEmbdedDTO;

import java.time.LocalDate;

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
}
