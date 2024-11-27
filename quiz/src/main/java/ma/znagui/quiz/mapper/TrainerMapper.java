package ma.znagui.quiz.mapper;


import ma.znagui.quiz.dto.trainer.TrainerCreateDTO;
import ma.znagui.quiz.dto.trainer.TrainerEmbdedDTO;
import ma.znagui.quiz.dto.trainer.TrainerResponseDTO;
import ma.znagui.quiz.entity.Trainer;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",uses = {QuizMapper.class})
public interface TrainerMapper {

    public TrainerResponseDTO trainerToResponseDTO(Trainer t);

    
    public Trainer crateDTOtoTranier(TrainerCreateDTO dto);

    public TrainerEmbdedDTO trainerToEmbdedDTO(Trainer trainer);
}
