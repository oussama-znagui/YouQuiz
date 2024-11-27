package ma.znagui.quiz.dto.quiz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Duration;

@AllArgsConstructor
@Getter
public class QuizEmbdedDTO {
    private Long id;
    private String title;
    private Duration duration;
    private int successScore;
    private int chances;

}
