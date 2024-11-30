package ma.znagui.quiz.mapper;

import ma.znagui.quiz.dto.subject.SubjectCreateDTO;
import ma.znagui.quiz.dto.subject.SubjectEmbdedDTO;
import ma.znagui.quiz.dto.subject.SubjectResponseDTO;
import ma.znagui.quiz.entity.Subject;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SubjectMapper {
    @Mapping(target = "subject.id",source = "subjectID")
    public Subject createDTOtoSubject(SubjectCreateDTO dto);

    @Mapping(target = "subjects", source = "subjects")
    public SubjectResponseDTO subjectToResponseDTO(Subject subject);

    public SubjectEmbdedDTO subjectToEmbdedDTO(Subject subject);

    @Mapping(target = "subject" ,ignore = true)
    public List<SubjectResponseDTO> subjectsToResponseListDTO(List<Subject> subjects);


}
