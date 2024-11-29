package ma.znagui.quiz.service;


import ma.znagui.quiz.dto.level.LevelCreateDTO;
import ma.znagui.quiz.dto.level.LevelResponseDTO;

public interface LevelService {
    LevelResponseDTO createLevel(LevelCreateDTO dto);
    LevelResponseDTO getOneLevel(Long id);

}
