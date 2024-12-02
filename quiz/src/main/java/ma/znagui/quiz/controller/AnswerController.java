package ma.znagui.quiz.controller;

import jakarta.validation.Valid;
import ma.znagui.quiz.dto.answer.AnswerCreateDTO;
import ma.znagui.quiz.dto.answer.AnswerResponseDTO;
import ma.znagui.quiz.entity.Answer;
import ma.znagui.quiz.service.AnswerService;
import ma.znagui.quiz.validation.api.CheckExisting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    @Autowired
    AnswerService service;
    @PostMapping
    public ResponseEntity<AnswerResponseDTO> create(@Valid @RequestBody AnswerCreateDTO dto){
        return ResponseEntity.ok(service.createAnswer(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnswerResponseDTO> getOne(@CheckExisting(entityC = Answer.class) @PathVariable("id") Long id){
        return ResponseEntity.ok(service.getAnswer(id));
    }
}
