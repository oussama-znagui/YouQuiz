package ma.znagui.quiz.dto.question;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.entity.Level;
import ma.znagui.quiz.entity.Subject;
import ma.znagui.quiz.validation.api.CheckExisting;

@AllArgsConstructor
@Getter
public class QuesionCreateDTO {
    @NotBlank(message = "la question svp")
    private String quetion;

    @NotNull(message = "le nombre de reponses SVP ! ")
    private int answers;

    @NotNull(message = "le nombre de reponses correct SVP ! ")
    private int correctAnswers;

    @NotBlank(message = "le type de la question SVP ! ")
    @Pattern(regexp = "SINGLE|MULTIPLE", message = "Le type doit etre 'SINGLE' ou 'MULTIPLE'")
    private String type;

    @NotNull(message = "ID du niveau svp ! ")
    @CheckExisting(entityC = Level.class)
    private Long levelID;

    @NotNull(message = "ID du sujet svp ! ")
    @CheckExisting(entityC = Subject.class)
    private Long subjectID;

}
