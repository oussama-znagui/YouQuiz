package ma.znagui.quiz.service;

import ma.znagui.quiz.dto.answerValidation.AnswerValidationCreateDTO;
import ma.znagui.quiz.dto.answerValidation.AnswerValidationResponseDTO;

public interface AnswerValidationService {

    AnswerValidationResponseDTO addAnswerValidation(AnswerValidationCreateDTO dto);
    AnswerValidationResponseDTO getAnswerValidation(Long id);
}
