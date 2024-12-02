package ma.znagui.quiz.dto.questionAnswer;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.entity.Answer;
import ma.znagui.quiz.entity.Question;
import ma.znagui.quiz.validation.api.CheckExisting;

@AllArgsConstructor
@Getter
public class QuestionAnswerCreateDTO {
    @CheckExisting(entityC = Question.class)
    @NotNull(message = "ID du question SVP ! ")
    private Long questionID;

    @CheckExisting(entityC = Answer.class)
    @NotNull(message = "ID du reponse SVP ! ")
    private Long AnswerID;

    @Min(0)
    @NotNull(message = "les points SVP !")
    private Double points;

}
