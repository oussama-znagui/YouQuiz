package ma.znagui.quiz.repository;

import ma.znagui.quiz.entity.QuizAssignement;
import org.mapstruct.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuizAssignementRepository extends JpaRepository<QuizAssignement,Long> {

}
