package ma.znagui.quiz.dto.answerValidation;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.entity.Answer;
import ma.znagui.quiz.entity.Question;
import ma.znagui.quiz.entity.QuizAssignement;
import ma.znagui.quiz.validation.api.CheckExisting;

@AllArgsConstructor
@Getter
public class AnswerValidationCreateDTO {

    @NotNull(message = "ID du quiz assignement SVP !")
    @CheckExisting(entityC = QuizAssignement.class)
    private Long quizAssignementID;

    @NotNull(message = "ID du question SVP !")
    @CheckExisting(entityC = Question.class)
    private Long questionID;

    @NotNull(message = "ID de reponse SVP !")
    @CheckExisting(entityC = Answer.class)
    private Long answerID;

}

