package ma.znagui.quiz.dto.quizAssignement;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.entity.Quiz;
import ma.znagui.quiz.entity.Student;
import ma.znagui.quiz.validation.api.CheckExisting;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class QuizAssignementCreateDTO {
    @NotBlank(message = "la reaison de l'assignement")
    private String reason;

    private LocalDate startDate;

    private LocalDate endDate;
    @NotNull(message = "ID du quiz SVP !")
    @CheckExisting(entityC = Quiz.class)
    private Long quizID;

    @NotNull(message = "ID de l'etudiant SVP !")
    @CheckExisting(entityC = Student.class)
    private Long studentID;

}

