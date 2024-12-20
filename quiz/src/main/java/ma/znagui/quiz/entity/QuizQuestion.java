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
    public class QuizQuestion {
    @EmbeddedId
    private QuizQuestionKey id;

    private int timer;

    @MapsId("quizID")
    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
    @MapsId("quesionID")
    @ManyToOne
    @JoinColumn(name = "quesion_id")
    private Question question;



}
