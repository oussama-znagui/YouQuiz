package ma.znagui.quiz.controller;

import jakarta.validation.Valid;
import ma.znagui.quiz.dto.TrainerCreateDTO;
import ma.znagui.quiz.dto.TrainerResponseDTO;
import ma.znagui.quiz.entity.Trainer;
import ma.znagui.quiz.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

    @Autowired
    TrainerService service;

    @PostMapping
    public ResponseEntity<TrainerResponseDTO> create(@Valid @RequestBody TrainerCreateDTO dto){
        return ResponseEntity.ok(service.createTrainer(dto));
    }
}
