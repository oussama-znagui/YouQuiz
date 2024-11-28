package ma.znagui.quiz.mapper;

import ma.znagui.quiz.dto.student.StudentEmbdedDTO;
import ma.znagui.quiz.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
   public StudentEmbdedDTO studentToEmbdedDTO(Student student);

}
