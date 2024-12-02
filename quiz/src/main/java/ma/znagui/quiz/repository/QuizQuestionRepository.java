package ma.znagui.quiz.repository;

import ma.znagui.quiz.entity.QuizQuestion;
import ma.znagui.quiz.entity.QuizQuestionKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, QuizQuestionKey> {

}
