package ma.znagui.quiz.mapper;

import ma.znagui.quiz.dto.question.QuesionCreateDTO;
import ma.znagui.quiz.dto.question.QuestionResponseDTO;
import ma.znagui.quiz.entity.Question;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
 public interface QuestionMapper {

    @Mappings({
            @Mapping(target = "level.id", source = "levelID"),
            @Mapping(target = "subject.id", source = "subjectID")
    })
    public Question createDTOtoQuestion(QuesionCreateDTO dto);

    public QuestionResponseDTO questionToResponseDTO(Question question);

}