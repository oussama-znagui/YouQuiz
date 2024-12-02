package ma.znagui.quiz.dto.answerValidation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.dto.answer.AnswerEmbdedDTO;
import ma.znagui.quiz.dto.question.QuestionEmbdedDTO;
import ma.znagui.quiz.dto.quizAssignement.QuizAssignementEmbdedDTO;
@AllArgsConstructor
@Getter
public class AnswerValidationEmbdedDTO {
    private Long id;
    private Double points;
    private AnswerEmbdedDTO answer;
    private QuestionEmbdedDTO question;
}
