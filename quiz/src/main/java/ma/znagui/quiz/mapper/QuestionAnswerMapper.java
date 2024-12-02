package ma.znagui.quiz.mapper;

import ma.znagui.quiz.dto.questionAnswer.QuestionAnswerCreateDTO;
import ma.znagui.quiz.dto.questionAnswer.QuestionAnswerResponseDTO;
import ma.znagui.quiz.entity.QuestionAnswer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface QuestionAnswerMapper {

    @Mappings({
            @Mapping(target = "id.answerID", source = "answerID"),
            @Mapping(target = "id.questionID", source = "questionID"),
            @Mapping(target = "answer.id", source = "answerID"),
            @Mapping(target = "question.id", source = "questionID")
    })
    QuestionAnswer createDTOtoQuestionAnswer(QuestionAnswerCreateDTO dto);

    QuestionAnswerResponseDTO questionAnswerToResponseDTO(QuestionAnswer questionAnswer);


}
