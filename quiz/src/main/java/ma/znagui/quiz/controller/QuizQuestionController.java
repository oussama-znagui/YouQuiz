package ma.znagui.quiz.controller;

import jakarta.validation.Valid;
import ma.znagui.quiz.dto.quizQuestion.QuizQuestionCreateDTO;
import ma.znagui.quiz.dto.quizQuestion.QuizQuestionResponseDTO;
import ma.znagui.quiz.service.QuizQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz-quesion")
public class QuizQuestionController {
    @Autowired
    QuizQuestionService service;

    @PostMapping
    public ResponseEntity<QuizQuestionResponseDTO> create(@Valid @RequestBody QuizQuestionCreateDTO dto){
        return ResponseEntity.ok(service.assigneQuetionToQuiz(dto));

    }

}
