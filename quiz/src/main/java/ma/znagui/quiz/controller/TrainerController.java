package ma.znagui.quiz.controller;

import jakarta.validation.Valid;
import ma.znagui.quiz.dto.trainer.TrainerCreateDTO;
import ma.znagui.quiz.dto.trainer.TrainerResponseDTO;
import ma.znagui.quiz.entity.Trainer;
import ma.znagui.quiz.service.TrainerService;
import ma.znagui.quiz.validation.api.CheckExisting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

    @Autowired
    TrainerService service;

    @PostMapping
    public ResponseEntity<TrainerResponseDTO> create(@Valid @RequestBody TrainerCreateDTO dto){
        return ResponseEntity.ok(service.createTrainer(dto));
    }

    @GetMapping ("/{id}")
    public  ResponseEntity<TrainerResponseDTO> getOne(@CheckExisting(entityC = Trainer.class) @PathVariable("id") Long id){
        return ResponseEntity.ok(service.getOneTrainer(id));
    }
}
