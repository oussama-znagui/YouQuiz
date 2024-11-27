package ma.znagui.quiz.dto.trainer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.quiz.dto.quiz.QuizEmbdedDTO;
import ma.znagui.quiz.entity.Quiz;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter

public class TrainerResponseDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String address;
    private String specialty;
    private List<QuizEmbdedDTO> quizzes;


}
