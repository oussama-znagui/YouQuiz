package ma.znagui.quiz.dto.questionAnswer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.dto.answer.AnswerEmbdedDTO;
import ma.znagui.quiz.dto.question.QuestionEmbdedDTO;
import ma.znagui.quiz.entity.Answer;
import ma.znagui.quiz.entity.Question;

@AllArgsConstructor
@Getter
public class QuestionAnswerResponseDTO {
    private Double points;
    private QuestionEmbdedDTO question;
    private AnswerEmbdedDTO answer;
}
