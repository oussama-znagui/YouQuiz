package ma.znagui.quiz.dto.subject;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.entity.Subject;
import ma.znagui.quiz.validation.api.CheckExisting;

@AllArgsConstructor
@Getter
public class SubjectCreateDTO {
    @NotBlank(message = "le titre svp")
    private String title;

    @CheckExisting(entityC = Subject.class)
    private Long subjectID;

}
