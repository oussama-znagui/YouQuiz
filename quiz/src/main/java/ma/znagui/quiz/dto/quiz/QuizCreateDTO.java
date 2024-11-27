package ma.znagui.quiz.dto.quiz;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ma.znagui.quiz.entity.Trainer;
import ma.znagui.quiz.validation.api.CheckExisting;
import org.springframework.boot.convert.DurationFormat;

import java.time.Duration;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class QuizCreateDTO {
    @NotBlank(message = "le titre svp!")
    private String title;
    @NotNull(message = "la durree du Quiz SVP!")
    private Duration duration;

    @NotNull(message = "le score de validation svp!")
    private int successScore;

    @NotNull(message = "le droit de Voir les reponse est obligatoire (True/False)")
    private Boolean rightToViewResponses;
    @NotNull(message = "le droit de Voir le resultat est obligatoire (True/False)")
    private Boolean canViewTheResult;
    @NotNull(message = "les chanse svp!")
    @Min(1)
    private int chances;
    @NotNull(message = "des remarque svp! ou notez RAS")
    private String remark;

    @NotNull(message = "ID du formateur svp!")
    @CheckExisting(entityC = Trainer.class)
    private Long trainerID;

}
