package ma.znagui.quiz.controller;

import jakarta.validation.Valid;
import ma.znagui.quiz.dto.quiz.QuizCreateDTO;
import ma.znagui.quiz.dto.quiz.QuizResponseDTO;
import ma.znagui.quiz.entity.Quiz;
import ma.znagui.quiz.service.QuizService;
import ma.znagui.quiz.validation.api.CheckExisting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quizzes")
public class QuizController {
    @Autowired
    QuizService service;

    @PostMapping
    public ResponseEntity<QuizResponseDTO> create(@Valid @RequestBody QuizCreateDTO dto){
        return ResponseEntity.ok(service.createQuiz(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuizResponseDTO> getOne(@CheckExisting(entityC = Quiz.class) @PathVariable("id") Long id){
        return ResponseEntity.ok(service.getOneQuiz(id));
    }
}
