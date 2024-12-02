package ma.znagui.quiz.mapper;

import ma.znagui.quiz.dto.question.QuesionCreateDTO;
import ma.znagui.quiz.dto.question.QuestionResponseDTO;
import ma.znagui.quiz.dto.quizQuestion.QuizQuestionCreateDTO;
import ma.znagui.quiz.dto.quizQuestion.QuizQuestionResponseDTO;
import ma.znagui.quiz.dto.quizQuestion.QuizQuetionEmbdedDTO;
import ma.znagui.quiz.entity.Question;
import ma.znagui.quiz.entity.QuizQuestion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface QuizQuestionMapper {

    @Mappings({
            @Mapping(target = "id.quizID", source = "quizID"),
            @Mapping(target = "id.quesionID", source = "questionID"),
            @Mapping(target = "quiz.id",source = "quizID"),
            @Mapping(target = "question.id", source = "questionID")


    })
    QuizQuestion createDTOtoQuestion(QuizQuestionCreateDTO dto) ;

    QuizQuestionResponseDTO questionToResponseDTO(QuizQuestion question);

    QuizQuetionEmbdedDTO questionToEmbdedDTO(QuizQuestion question);


}
