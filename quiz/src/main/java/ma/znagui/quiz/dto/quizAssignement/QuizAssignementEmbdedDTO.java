package ma.znagui.quiz.dto.quizAssignement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.dto.student.StudentEmbdedDTO;

import java.time.LocalDate;
@AllArgsConstructor
@Getter
public class QuizAssignementEmbdedDTO {
    private Long id;
    private String reason;
    private int attempt;
    private Double score;
    private Double result;
    private StudentEmbdedDTO student;
}
