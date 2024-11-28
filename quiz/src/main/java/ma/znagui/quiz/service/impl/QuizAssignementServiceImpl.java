package ma.znagui.quiz.service.impl;

import ma.znagui.quiz.dto.quizAssignement.QuizAssignementCreateDTO;
import ma.znagui.quiz.dto.quizAssignement.QuizAssignementResponseDTO;
import ma.znagui.quiz.entity.QuizAssignement;
import ma.znagui.quiz.mapper.QuizAssignemntMapper;
import ma.znagui.quiz.repository.QuizAssignementRepository;
import ma.znagui.quiz.service.QuizAssignementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizAssignementServiceImpl implements QuizAssignementService {
    @Autowired
    QuizAssignemntMapper mapper;
    @Autowired
    QuizAssignementRepository repository;

    public QuizAssignementResponseDTO assigneQuizToStudent(QuizAssignementCreateDTO dto) {
        QuizAssignement quizAssignement = mapper.createDTOtoQuizAssignement(dto);
        System.out.println(quizAssignement.toString());
        return null;
    }

    public QuizAssignementResponseDTO getAssignement(Long id) {
        return null;
    }
}
