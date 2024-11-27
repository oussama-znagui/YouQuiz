package ma.znagui.quiz.mapper;


import ma.znagui.quiz.dto.quiz.QuizCreateDTO;
import ma.znagui.quiz.dto.quiz.QuizEmbdedDTO;
import ma.znagui.quiz.dto.quiz.QuizResponseDTO;
import ma.znagui.quiz.entity.Quiz;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring" )
public interface QuizMapper {
    @Mapping(target = "trainer.id", source = "trainerID")
        public Quiz createDTOtoQuiz(QuizCreateDTO dto);
        public QuizResponseDTO quizToResponseDTO(Quiz quiz);
        public QuizEmbdedDTO quizToEmbdedDTO(Quiz quiz);

}
