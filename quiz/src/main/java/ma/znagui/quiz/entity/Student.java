package ma.znagui.quiz.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Student extends Person{
    private LocalDate registrationDate;

}
