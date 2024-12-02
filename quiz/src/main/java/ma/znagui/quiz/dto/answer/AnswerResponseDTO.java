package ma.znagui.quiz.dto.answer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AnswerResponseDTO {
    private Long id;

    private String answer;
}
