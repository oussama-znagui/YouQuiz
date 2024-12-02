package ma.znagui.quiz.service.impl;

import ma.znagui.quiz.dto.answer.AnswerCreateDTO;
import ma.znagui.quiz.dto.answer.AnswerResponseDTO;
import ma.znagui.quiz.entity.Answer;
import ma.znagui.quiz.exception.ResourceNotFoundExeption;
import ma.znagui.quiz.mapper.AnswerMapper;
import ma.znagui.quiz.repository.AnswerRepository;
import ma.znagui.quiz.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerMapper mapper;
    @Autowired
    AnswerRepository repository;


    public AnswerResponseDTO createAnswer(AnswerCreateDTO dto) {
        Answer answer = mapper.createDTOtoAnswer(dto);

        return mapper.answerToResponseDTO(repository.save(answer));
    }

    public AnswerResponseDTO getAnswer(Long id) {
        return mapper.answerToResponseDTO(repository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("answer",id)));
    }

    public Answer getAnswerEntityByID(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("answer",id));
    }
}
