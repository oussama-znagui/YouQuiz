package ma.znagui.quiz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ma.znagui.quiz.enums.QuesionType;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String quetion;
    private int answers;
    private int correctAnswers;
    private QuesionType type;

    @OneToMany(mappedBy = "question")
    private List<QuizQuestion> quizQuestions;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;
//
//    @OneToMany(mappedBy = "question")
//    List<AnswerValidation> answerValidations;

}
