package ma.znagui.quiz.controller;

import jakarta.validation.Valid;
import ma.znagui.quiz.dto.quizAssignement.QuizAssignementCreateDTO;
import ma.znagui.quiz.dto.quizAssignement.QuizAssignementResponseDTO;
import ma.znagui.quiz.service.QuizAssignementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz-ssignement")
public class QuizAssignementController {
    @Autowired
    QuizAssignementService service;

    @PostMapping
    public ResponseEntity<QuizAssignementResponseDTO> create(@Valid @RequestBody QuizAssignementCreateDTO dto){
        return ResponseEntity.ok(service.assigneQuizToStudent(dto));
    }
}
