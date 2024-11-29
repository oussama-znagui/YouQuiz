package ma.znagui.quiz.dto.subject;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
@AllArgsConstructor
@Getter
public class SubjectResponseDTO {
    private Long id;
    private String title;
    List<SubjectResponseDTO> subjects;
}
