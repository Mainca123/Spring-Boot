package com.example.demo.domain.mapper;

import com.example.demo.domain.dto.request.CreatePositionDTO;
import com.example.demo.domain.dto.response.PositionResponseDTO;
import com.example.demo.domain.entity.Position;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PositionMapper {
    Position toPosition(CreatePositionDTO createPositionDTO);
    PositionResponseDTO toPositionResponseDTO(Position position);
    List<PositionResponseDTO> toPositionResponseDTOList(List<Position> positions);
}
