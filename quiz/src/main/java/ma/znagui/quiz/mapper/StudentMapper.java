package ma.znagui.quiz.mapper;

import ma.znagui.quiz.dto.question.QuesionCreateDTO;
import ma.znagui.quiz.dto.question.QuestionResponseDTO;
import ma.znagui.quiz.dto.student.StudentEmbdedDTO;
import ma.znagui.quiz.entity.Question;
import ma.znagui.quiz.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface StudentMapper {
   public StudentEmbdedDTO studentToEmbdedDTO(Student student);

}
