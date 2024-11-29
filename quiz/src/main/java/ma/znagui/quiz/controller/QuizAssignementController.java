package ma.znagui.quiz.controller;

import jakarta.validation.Valid;
import ma.znagui.quiz.dto.quizAssignement.QuizAssignementCreateDTO;
import ma.znagui.quiz.dto.quizAssignement.QuizAssignementResponseDTO;
import ma.znagui.quiz.entity.QuizAssignement;
import ma.znagui.quiz.service.QuizAssignementService;
import ma.znagui.quiz.validation.api.CheckExisting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz-assignements")
public class QuizAssignementController {
    @Autowired
    QuizAssignementService service;

    @PostMapping
    public ResponseEntity<QuizAssignementResponseDTO> create(@Valid @RequestBody QuizAssignementCreateDTO dto){
        return ResponseEntity.ok(service.assigneQuizToStudent(dto));
    }


    @GetMapping("/{id}")
    public ResponseEntity<QuizAssignementResponseDTO> getONE(@CheckExisting(entityC = QuizAssignement.class) @PathVariable("id") Long id){
        return ResponseEntity.ok(service.getAssignement(id));
    }
}
