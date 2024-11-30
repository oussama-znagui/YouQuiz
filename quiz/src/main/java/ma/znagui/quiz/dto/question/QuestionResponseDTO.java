package ma.znagui.quiz.dto.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.dto.level.LevelEmbdedDTO;
import ma.znagui.quiz.dto.subject.SubjectEmbdedDTO;
import ma.znagui.quiz.enums.QuesionType;

@AllArgsConstructor
@Getter
public class QuestionResponseDTO {
    private Long id;
    private String quetion;
    private int answers;
    private int correctAnswers;
    private String type;
    private SubjectEmbdedDTO subject;
    private LevelEmbdedDTO level;
}
