package ma.znagui.quiz.dto.student;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class StudentEmbdedDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate registrationDate;
}
