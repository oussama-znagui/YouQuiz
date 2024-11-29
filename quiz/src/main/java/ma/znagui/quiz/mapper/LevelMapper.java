package ma.znagui.quiz.mapper;

import ma.znagui.quiz.dto.level.LevelCreateDTO;
import ma.znagui.quiz.dto.level.LevelEmbdedDTO;
import ma.znagui.quiz.dto.level.LevelResponseDTO;
import ma.znagui.quiz.entity.Level;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LevelMapper {

    public Level createDTOtoLevel(LevelCreateDTO dto);
    public LevelResponseDTO levelToResponseDTO(Level level);
    public LevelEmbdedDTO levelToEmbdedDTO(Level level);

}
