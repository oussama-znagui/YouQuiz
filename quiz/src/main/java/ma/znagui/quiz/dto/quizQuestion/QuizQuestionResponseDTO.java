package ma.znagui.quiz.dto.quizQuestion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.dto.question.QuestionEmbdedDTO;
import ma.znagui.quiz.dto.quiz.QuizEmbdedDTO;

@AllArgsConstructor
@Getter
public class QuizQuestionResponseDTO {

    private int timer;
    private QuizEmbdedDTO quiz;
    private QuestionEmbdedDTO question;
}
