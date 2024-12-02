package ma.znagui.quiz.repository;

import ma.znagui.quiz.entity.QuestionAnswer;
import ma.znagui.quiz.entity.QuestionAnswerKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionAnswerRepository extends JpaRepository<QuestionAnswer, QuestionAnswerKey> {
}
