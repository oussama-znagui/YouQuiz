package ma.znagui.quiz.controller;

import jakarta.validation.Valid;
import ma.znagui.quiz.dto.question.QuesionCreateDTO;
import ma.znagui.quiz.dto.question.QuestionResponseDTO;
import ma.znagui.quiz.entity.Question;
import ma.znagui.quiz.service.QuestionService;
import ma.znagui.quiz.validation.api.CheckExisting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    QuestionService service;

    @PostMapping
    public ResponseEntity<QuestionResponseDTO> create(@Valid @RequestBody QuesionCreateDTO dto){
        return ResponseEntity.ok(service.createQuesion(dto));

    }

    @GetMapping("/{id}")
    public ResponseEntity<QuestionResponseDTO> getOne(@CheckExisting(entityC = Question.class) @PathVariable("id") Long id){
        return ResponseEntity.ok(service.getOneQuestion(id));
    }
}
