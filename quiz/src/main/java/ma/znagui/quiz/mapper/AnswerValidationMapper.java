package ma.znagui.quiz.mapper;

import ma.znagui.quiz.dto.answerValidation.AnswerValidationCreateDTO;
import ma.znagui.quiz.dto.answerValidation.AnswerValidationEmbdedDTO;
import ma.znagui.quiz.dto.answerValidation.AnswerValidationResponseDTO;
import ma.znagui.quiz.entity.AnswerValidation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
@Mapper(componentModel = "spring")
public interface AnswerValidationMapper {

    @Mappings({
            @Mapping(target = "quizAssignement.id", source = "quizAssignementID"),
            @Mapping(target = "answer.id",source = "answerID"),
            @Mapping(target = "question.id", source = "questionID")
    })
    AnswerValidation createDTOtoAnswerValidation(AnswerValidationCreateDTO dto);

    AnswerValidationResponseDTO answerValidationToResponseDTO(AnswerValidation answerValidation);

    AnswerValidationEmbdedDTO answerValidationToEmbdedDTO(AnswerValidation answerValidation);
}
