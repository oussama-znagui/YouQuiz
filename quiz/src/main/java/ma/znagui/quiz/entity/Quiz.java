package ma.znagui.quiz.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Duration;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Duration duration;
    private int successScore;
    private Boolean rightToViewResponses;
    private Boolean canViewTheResult;
    private int chances;
    private String remark;

    @ManyToOne
    @JoinColumn(name = "trainer_id",nullable = false)
    private Trainer trainer;

    @OneToMany(mappedBy = "quiz")
    private List<QuizAssignement> quizAssignements;





}
