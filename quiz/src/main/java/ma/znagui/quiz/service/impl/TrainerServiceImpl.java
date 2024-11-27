package ma.znagui.quiz.service.impl;

import ma.znagui.quiz.dto.trainer.TrainerCreateDTO;
import ma.znagui.quiz.dto.trainer.TrainerResponseDTO;
import ma.znagui.quiz.entity.Trainer;
import ma.znagui.quiz.exception.ResourceNotFoundExeption;
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
//        return null;
    }

    public TrainerResponseDTO getOneTrainer(Long id) {
        Trainer t = repository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("Formateur",id));
        return mapper.trainerToResponseDTO(t);
    }

    public Trainer getTrainerEntityByID(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("Formateur",id));
    }

    public TrainerResponseDTO deleteTrainerByID(Long id) {
        return null;
    }
}
