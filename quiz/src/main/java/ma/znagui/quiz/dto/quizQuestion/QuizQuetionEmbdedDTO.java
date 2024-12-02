package ma.znagui.quiz.dto.quizQuestion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.dto.question.QuestionEmbdedDTO;

@AllArgsConstructor
@Getter
public class QuizQuetionEmbdedDTO {
    private int timer;
    private QuestionEmbdedDTO question;


}
