package ma.znagui.quiz.mapper;

import ma.znagui.quiz.dto.subject.SubjectCreateDTO;
import ma.znagui.quiz.dto.subject.SubjectEmbdedDTO;
import ma.znagui.quiz.dto.subject.SubjectResponseDTO;
import ma.znagui.quiz.entity.Subject;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubjectMapper {

    public Subject createDTOtoSubject(SubjectCreateDTO dto);
    public SubjectResponseDTO subjectToResponseDTO(Subject subject);
    public SubjectEmbdedDTO subjectToEmbdedDTO(Subject subject);


}
