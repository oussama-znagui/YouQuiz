package ma.znagui.quiz.dto.answer;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AnswerCreateDTO {
    @NotNull(message = "le contenu d reponse SVP !")
    private String answer;
}
