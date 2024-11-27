package ma.znagui.quiz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Trainer extends Person {
    private String Specialty;

    @OneToMany(mappedBy = "trainer")
    private List<Quiz> quizzes;

}
