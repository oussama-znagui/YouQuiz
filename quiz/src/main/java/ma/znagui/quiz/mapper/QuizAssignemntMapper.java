package ma.znagui.quiz.mapper;

import ma.znagui.quiz.dto.quizAssignement.QuizAssignementCreateDTO;
import ma.znagui.quiz.dto.quizAssignement.QuizAssignementResponseDTO;
import ma.znagui.quiz.entity.QuizAssignement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface QuizAssignemntMapper {

    @Mappings({
            @Mapping(target = "quiz.id" ,source = "quizID"),
            @Mapping(target = "student.id", source = "studentID")
    })
    public QuizAssignement createDTOtoQuizAssignement(QuizAssignementCreateDTO dto);

    public QuizAssignementResponseDTO quizAssignementToResponseDTO(QuizAssignement quizAssignement);

}

