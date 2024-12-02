package ma.znagui.quiz.service.impl;

import ma.znagui.quiz.dto.question.QuesionCreateDTO;
import ma.znagui.quiz.dto.question.QuestionResponseDTO;
import ma.znagui.quiz.entity.Level;
import ma.znagui.quiz.entity.Question;
import ma.znagui.quiz.enums.QuesionType;
import ma.znagui.quiz.exception.HasSubSubjectException;
import ma.znagui.quiz.exception.ResourceNotFoundExeption;
import ma.znagui.quiz.exception.SingleQuestionException;
import ma.znagui.quiz.exception.TooMuchCorrectAnswersException;
import ma.znagui.quiz.mapper.QuestionMapper;
import ma.znagui.quiz.mapper.StudentMapper;
import ma.znagui.quiz.repository.QuestionRepository;
import ma.znagui.quiz.service.LevelService;
import ma.znagui.quiz.service.QuestionService;
import ma.znagui.quiz.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionMapper mapper;
    @Autowired
    QuestionRepository repository;
    @Autowired
    LevelService levelService;
    @Autowired
    SubjectService subjectService;

    public QuestionResponseDTO createQuesion(QuesionCreateDTO dto) {
        Question question = mapper.createDTOtoQuestion(dto);
        if (question.getAnswers() <= question.getCorrectAnswers()){
            throw new TooMuchCorrectAnswersException();

        }

        if (subjectService.getSubjectEntiteByID(question.getSubject().getId()).getSubjects().size() != 0){
            throw new HasSubSubjectException(question.getSubject().getId());
        }
        System.out.println(question.getType());
        Level level = levelService.getLevelEntityByID(question.getLevel().getId());
        System.out.println(question.getType() == QuesionType.SINGLE && question.getCorrectAnswers() != 1 || question.getAnswers() != 2);

        if (question.getType() == QuesionType.SINGLE && (question.getCorrectAnswers() != 1 || question.getAnswers() != 2)){
            throw new SingleQuestionException();
        }

        Question created = repository.save(question);
        created.setLevel(level);
        created.setSubject(subjectService.getSubjectEntiteByID(question.getSubject().getId()));

        return mapper.questionToResponseDTO(created);
    }

    public QuestionResponseDTO getOneQuestion(Long id) {
        Question question = repository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("question",id));
        return mapper.questionToResponseDTO(question);
    }

    @Override
    public Question getQuestionEntityByID(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("question",id));
    }
}
