package ma.znagui.quiz.mapper;

import ma.znagui.quiz.dto.answer.AnswerCreateDTO;
import ma.znagui.quiz.dto.answer.AnswerEmbdedDTO;
import ma.znagui.quiz.dto.answer.AnswerResponseDTO;
import ma.znagui.quiz.entity.Answer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnswerMapper {
    Answer createDTOtoAnswer(AnswerCreateDTO dto);
    AnswerResponseDTO answerToResponseDTO(Answer answer);
    AnswerEmbdedDTO answerToEmbdedDTO(Answer answer);

}
