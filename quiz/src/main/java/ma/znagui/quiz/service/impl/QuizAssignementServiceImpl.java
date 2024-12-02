package ma.znagui.quiz.service.impl;

import lombok.SneakyThrows;
import ma.znagui.quiz.dto.quizAssignement.QuizAssignementCreateDTO;
import ma.znagui.quiz.dto.quizAssignement.QuizAssignementResponseDTO;
import ma.znagui.quiz.entity.Quiz;
import ma.znagui.quiz.entity.QuizAssignement;
import ma.znagui.quiz.exception.DatesAreNotValidException;
import ma.znagui.quiz.exception.MaxAttemptsReachedException;
import ma.znagui.quiz.exception.ResourceNotFoundExeption;
import ma.znagui.quiz.mapper.QuizAssignemntMapper;
import ma.znagui.quiz.repository.QuizAssignementRepository;
import ma.znagui.quiz.service.QuizAssignementService;
import ma.znagui.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizAssignementServiceImpl implements QuizAssignementService {
    @Autowired
    QuizAssignemntMapper mapper;
    @Autowired
    QuizService quizService;

    @Autowired
    QuizAssignementRepository repository;

    @SneakyThrows
    public QuizAssignementResponseDTO assigneQuizToStudent(QuizAssignementCreateDTO dto) {
        QuizAssignement quizAssignement = mapper.createDTOtoQuizAssignement(dto);
        System.out.println(quizAssignement.toString());

        if (quizAssignement.getEndDate().isBefore(quizAssignement.getStartDate())){
            throw new DatesAreNotValidException();
        }

        Quiz quiz = quizService.getQuizEntityByID(quizAssignement.getQuiz().getId());

        if (quiz.getChances() > quiz.getQuizAssignements().size()){
            int attempt = quiz.getQuizAssignements().size() + 1;
            quizAssignement.setAttempt(attempt);

            QuizAssignement assigned = repository.save(quizAssignement);
            assigned.setQuiz(quiz);
            return mapper.quizAssignementToResponseDTO(assigned);

        }else {
            throw new MaxAttemptsReachedException(quiz.getId(),quiz.getChances());

        }

    }

    public QuizAssignementResponseDTO getAssignement(Long id) {
        QuizAssignement quizAssignement = repository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("assignement",id));

        return mapper.quizAssignementToResponseDTO(quizAssignement);
    }

    public void addScoreAndResultToAssignemnt(Long id, Double points) {
        QuizAssignement quizAssignement = repository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("assignement",id));
        if (quizAssignement.getScore() == null){

            quizAssignement.setScore(points);
        }else {
            Double newScore =    quizAssignement.getScore() + points;
            quizAssignement.setScore(newScore);
        }

     repository.save(quizAssignement);



    }

    public QuizAssignement getEntityByID(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("assignement",id));
    }
}
