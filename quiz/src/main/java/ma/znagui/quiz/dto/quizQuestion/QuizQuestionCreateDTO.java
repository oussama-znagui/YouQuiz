package ma.znagui.quiz.dto.quizQuestion;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.entity.Question;
import ma.znagui.quiz.entity.Quiz;
import ma.znagui.quiz.validation.api.CheckExisting;

@AllArgsConstructor
@Getter
public class QuizQuestionCreateDTO {
    @NotNull(message = "timer SVP !")
    @Min(1)
    private int timer;
    @NotNull(message = "ID du quiz SVP!")
    @CheckExisting(entityC = Quiz.class)
    private Long quizID;

    @NotNull(message = "ID du question SVP!")
    @CheckExisting(entityC = Question.class)
    private Long questionID;
}
