package ma.znagui.quiz.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class AnswerValidation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double points;

    @ManyToOne
    @JoinColumn(name = "quiz_assignement_id",nullable = false)
    private QuizAssignement quizAssignement;

    @ManyToOne
    @JoinColumn(name = "answer_id",nullable = false)
    private Answer answer;

    @ManyToOne
    @JoinColumn(name = "question_id",nullable = false)
    private Question question;


}
