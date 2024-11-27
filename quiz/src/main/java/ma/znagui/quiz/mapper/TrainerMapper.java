package ma.znagui.quiz.mapper;


import ma.znagui.quiz.dto.TrainerCreateDTO;
import ma.znagui.quiz.dto.TrainerResponseDTO;
import ma.znagui.quiz.entity.Trainer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface TrainerMapper {

    public TrainerResponseDTO trainerToResponseDTO(Trainer t);

    
    public Trainer crateDTOtoTranier(TrainerCreateDTO dto);
}
