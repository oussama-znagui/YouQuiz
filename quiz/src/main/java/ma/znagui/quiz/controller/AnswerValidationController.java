package ma.znagui.quiz.controller;

import jakarta.validation.Valid;
import ma.znagui.quiz.dto.answerValidation.AnswerValidationCreateDTO;
import ma.znagui.quiz.dto.answerValidation.AnswerValidationResponseDTO;
import ma.znagui.quiz.entity.AnswerValidation;
import ma.znagui.quiz.service.AnswerValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/answer-validation")
public class AnswerValidationController {
    @Autowired
    AnswerValidationService service;

    @PostMapping
    public ResponseEntity<AnswerValidationResponseDTO> create(@Valid @RequestBody AnswerValidationCreateDTO dto){
        return ResponseEntity.ok(service.addAnswerValidation(dto));

    }

}
