package ma.znagui.quiz.repository;

import ma.znagui.quiz.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
