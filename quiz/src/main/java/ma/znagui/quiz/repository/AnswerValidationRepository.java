package ma.znagui.quiz.repository;

import ma.znagui.quiz.entity.AnswerValidation;
import ma.znagui.quiz.entity.Level;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerValidationRepository extends JpaRepository<AnswerValidation, Long> {
}
