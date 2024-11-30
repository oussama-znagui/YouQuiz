package ma.znagui.quiz.controller;

import jakarta.validation.Valid;
import ma.znagui.quiz.dto.subject.SubjectCreateDTO;
import ma.znagui.quiz.dto.subject.SubjectResponseDTO;
import ma.znagui.quiz.entity.Subject;
import ma.znagui.quiz.service.SubjectService;
import ma.znagui.quiz.validation.api.CheckExisting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    SubjectService service;

    @PostMapping
    public ResponseEntity<SubjectResponseDTO> create(@Valid @RequestBody SubjectCreateDTO dto){
        return ResponseEntity.ok(service.createSubject(dto));
    }


    @GetMapping("/{id}")
    public ResponseEntity<SubjectResponseDTO> getOne(@CheckExisting(entityC = Subject.class) @PathVariable("id") Long id){
        return ResponseEntity.ok(service.getOneSubject(id));
    }
}
