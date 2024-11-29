package ma.znagui.quiz.service;

import ma.znagui.quiz.dto.subject.SubjectCreateDTO;
import ma.znagui.quiz.dto.subject.SubjectResponseDTO;

public interface SubjectService {
    SubjectResponseDTO createSubject(SubjectCreateDTO dto);
    SubjectResponseDTO getOneSubject(Long id);


}
