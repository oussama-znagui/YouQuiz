package ma.znagui.quiz.service.impl;

import ma.znagui.quiz.dto.TrainerCreateDTO;
import ma.znagui.quiz.dto.TrainerResponseDTO;
import ma.znagui.quiz.entity.Trainer;
import ma.znagui.quiz.mapper.TrainerMapper;
import ma.znagui.quiz.repository.TrainerRepository;
import ma.znagui.quiz.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceImpl implements TrainerService {
    @Autowired
    TrainerMapper mapper;
    @Autowired
    TrainerRepository repository;


    public TrainerResponseDTO createTrainer(TrainerCreateDTO dto) {
        Trainer t = mapper.crateDTOtoTranier(dto);
        System.out.println(t.getAddress());

        Trainer created = repository.save(t);

        return mapper.trainerToResponseDTO(created);
    }

    public TrainerResponseDTO getOneTrainer(Long id) {
        return null;
    }

    public Trainer getTrainerEntityByID(Long id) {
        return null;
    }

    public TrainerResponseDTO deleteTrainerByID(Long id) {
        return null;
    }
}
