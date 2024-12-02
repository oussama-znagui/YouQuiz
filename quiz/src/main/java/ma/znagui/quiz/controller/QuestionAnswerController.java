package ma.znagui.quiz.controller;

import jakarta.validation.Valid;
import ma.znagui.quiz.dto.questionAnswer.QuestionAnswerCreateDTO;
import ma.znagui.quiz.dto.questionAnswer.QuestionAnswerResponseDTO;
import ma.znagui.quiz.service.QuestionAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question-answer")
public class QuestionAnswerController {
    @Autowired
    QuestionAnswerService service;

    @PostMapping
    public ResponseEntity<QuestionAnswerResponseDTO> create(@Valid @RequestBody QuestionAnswerCreateDTO dto){
        return ResponseEntity.ok(service.assignQuestionToAnswer(dto));
    }
}
