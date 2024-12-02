package ma.znagui.quiz.dto.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.dto.level.LevelEmbdedDTO;
import ma.znagui.quiz.dto.subject.SubjectEmbdedDTO;

@AllArgsConstructor
@Getter
public class QuestionEmbdedDTO {
    private Long id;
    private String quetion;
    private int answers;
    private int correctAnswers;
    private String type;
    private SubjectEmbdedDTO subject;
    private LevelEmbdedDTO level;


}
