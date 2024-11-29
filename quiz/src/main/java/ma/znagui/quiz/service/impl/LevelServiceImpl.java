package ma.znagui.quiz.service.impl;

import ma.znagui.quiz.dto.level.LevelCreateDTO;
import ma.znagui.quiz.dto.level.LevelResponseDTO;
import ma.znagui.quiz.entity.Level;
import ma.znagui.quiz.mapper.LevelMapper;
import ma.znagui.quiz.repository.LevelRepository;
import ma.znagui.quiz.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LevelServiceImpl implements LevelService {
    @Autowired
    LevelMapper mapper;
    @Autowired
    LevelRepository repository;

    public LevelResponseDTO createLevel(LevelCreateDTO dto) {
        Level level = mapper.createDTOtoLevel(dto);
        Level created = repository.save(level);
        return mapper.levelToResponseDTO(created);
    }

    public LevelResponseDTO getOneLevel(Long id) {
        return null;
    }
}
