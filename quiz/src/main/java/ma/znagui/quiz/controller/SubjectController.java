package ma.znagui.quiz.controller;

import jakarta.validation.Valid;
import ma.znagui.quiz.dto.subject.SubjectCreateDTO;
import ma.znagui.quiz.dto.subject.SubjectResponseDTO;
import ma.znagui.quiz.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    SubjectService service;

    @PostMapping
    public ResponseEntity<SubjectResponseDTO> create(@Valid @RequestBody SubjectCreateDTO dto){
        return ResponseEntity.ok(service.createSubject(dto));

    }
}
