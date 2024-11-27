package ma.znagui.quiz.service;

import ma.znagui.quiz.dto.TrainerCreateDTO;
import ma.znagui.quiz.dto.TrainerResponseDTO;
import ma.znagui.quiz.entity.Trainer;

public interface TrainerService {
    TrainerResponseDTO createTrainer(TrainerCreateDTO dto);
    TrainerResponseDTO getOneTrainer(Long id);
    Trainer getTrainerEntityByID(Long id);
    TrainerResponseDTO deleteTrainerByID(Long id);

}
