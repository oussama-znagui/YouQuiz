package ma.znagui.quiz.dto.level;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LevelCreateDTO {
    @NotBlank(message = "la description du niveau SVP!")
    private String description;

    @NotNull(message = "Veuillez indiquer le max de points pour ce niveau SVP ! ")
    private Double maxPoints;

    @NotNull(message = "Veuillez indiquer le min de points pour ce niveau SVP ! ")
    private Double minPoints;
}
