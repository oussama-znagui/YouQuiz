package ma.znagui.quiz.service.impl;

import ma.znagui.quiz.dto.subject.SubjectCreateDTO;
import ma.znagui.quiz.dto.subject.SubjectResponseDTO;
import ma.znagui.quiz.entity.Subject;
import ma.znagui.quiz.mapper.SubjectMapper;
import ma.znagui.quiz.repository.SubjectRepository;
import ma.znagui.quiz.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    SubjectMapper mapper;
    @Autowired
    SubjectRepository repository;


    public SubjectResponseDTO createSubject(SubjectCreateDTO dto) {
        Subject subject = mapper.createDTOtoSubject(dto);
        Subject created = repository.save(subject);
        return mapper.subjectToResponseDTO(created);
    }

    public SubjectResponseDTO getOneSubject(Long id) {
        return null;
    }
}
