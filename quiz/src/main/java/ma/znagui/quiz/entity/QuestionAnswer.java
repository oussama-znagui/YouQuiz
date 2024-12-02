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
public class QuestionAnswer {
    @EmbeddedId
    private QuestionAnswerKey id;
    private Double points;

    @MapsId("questionID")
    @ManyToOne
    @JoinColumn(name = "question_id" ,nullable = false)
    private Question question;

    @MapsId("answerID")
    @ManyToOne
    @JoinColumn(name = "answer_id" ,nullable = false)
    private Answer answer;

}
