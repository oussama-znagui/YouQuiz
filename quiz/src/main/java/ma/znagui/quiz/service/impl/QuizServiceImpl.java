package ma.znagui.quiz.service.impl;

import ma.znagui.quiz.dto.quiz.QuizCreateDTO;
import ma.znagui.quiz.dto.quiz.QuizResponseDTO;
import ma.znagui.quiz.entity.Quiz;
import ma.znagui.quiz.exception.ResourceNotFoundExeption;
import ma.znagui.quiz.mapper.QuizMapper;
import ma.znagui.quiz.repository.QuizRepository;
import ma.znagui.quiz.service.QuizService;
import ma.znagui.quiz.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl implements QuizService {
    @Autowired
    QuizMapper mapper;
    @Autowired
    QuizRepository repository;
    @Autowired
    TrainerService trainerService;


    public QuizResponseDTO createQuiz(QuizCreateDTO dto) {
        Quiz quiz = mapper.createDTOtoQuiz(dto);
        Quiz created = repository.save(quiz);
        created.setTrainer(trainerService.getTrainerEntityByID(created.getTrainer().getId()));
        return mapper.quizToResponseDTO(created);
    }


    public QuizResponseDTO getOneQuiz(Long id) {
        Quiz quiz = repository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("quiz",id));


        return mapper.quizToResponseDTO(quiz);
    }

    @Override
    public Quiz getQuizEntityByID(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("quiz",id));
    }
}
