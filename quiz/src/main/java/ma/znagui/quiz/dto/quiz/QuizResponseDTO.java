package ma.znagui.quiz.dto.quiz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.dto.trainer.TrainerEmbdedDTO;
import ma.znagui.quiz.entity.Trainer;

import java.time.Duration;

@AllArgsConstructor
@Getter

public class QuizResponseDTO {
    private Long id;
    private String title;
    private Duration duration;
    private int successScore;
    private Boolean rightToViewResponses;
    private Boolean canViewTheResult;
    private int chances;
    private String remark;
    private TrainerEmbdedDTO trainer;

}
