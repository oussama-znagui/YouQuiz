package ma.znagui.quiz.service;

import ma.znagui.quiz.dto.answer.AnswerCreateDTO;
import ma.znagui.quiz.dto.answer.AnswerResponseDTO;
import ma.znagui.quiz.entity.Answer;

public interface AnswerService {
    AnswerResponseDTO createAnswer(AnswerCreateDTO dto);
    AnswerResponseDTO getAnswer(Long id);
    Answer getAnswerEntityByID(Long id);
}
