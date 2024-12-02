package ma.znagui.quiz.service;

import ma.znagui.quiz.dto.subject.SubjectCreateDTO;
import ma.znagui.quiz.dto.subject.SubjectResponseDTO;
import ma.znagui.quiz.entity.Subject;

public interface SubjectService {
    SubjectResponseDTO createSubject(SubjectCreateDTO dto);
    SubjectResponseDTO getOneSubject(Long id);

    Subject getSubjectEntiteByID(Long id);


}
