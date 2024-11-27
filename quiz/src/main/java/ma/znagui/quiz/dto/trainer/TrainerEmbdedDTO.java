package ma.znagui.quiz.dto.trainer;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
@AllArgsConstructor
@Getter
public class TrainerEmbdedDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String specialty;
}
