package ma.znagui.quiz.controller;

import jakarta.validation.Valid;
import ma.znagui.quiz.dto.level.LevelCreateDTO;
import ma.znagui.quiz.dto.level.LevelResponseDTO;
import ma.znagui.quiz.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/levels")
public class LevelController {
    @Autowired
    LevelService service;

    @PostMapping
    private ResponseEntity<LevelResponseDTO> create(@Valid @RequestBody LevelCreateDTO dto){
        return ResponseEntity.ok(service.createLevel(dto));
    }



}
