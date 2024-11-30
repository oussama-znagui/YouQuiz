package ma.znagui.quiz.dto.level;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LevelEmbdedDTO {
    private Long id;
    private String description;
    private Double maxPoints;
    private Double minPoints;
}
