package ma.znagui.quiz.dto.level;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LevelResponseDTO {
    private Long id;
    private String description;
    private Double maxPoints;
    private Double minPoints;

}
