package ma.znagui.quiz.service;

import ma.znagui.quiz.dto.questionAnswer.QuestionAnswerCreateDTO;
import ma.znagui.quiz.dto.questionAnswer.QuestionAnswerResponseDTO;
import ma.znagui.quiz.entity.QuestionAnswer;
import ma.znagui.quiz.entity.QuestionAnswerKey;

public interface QuestionAnswerService {
    QuestionAnswerResponseDTO assignQuestionToAnswer(QuestionAnswerCreateDTO dto);
    QuestionAnswerResponseDTO getQuestionAnswer(QuestionAnswerKey key);
    QuestionAnswer getEntityByKey(QuestionAnswerKey key);



}
