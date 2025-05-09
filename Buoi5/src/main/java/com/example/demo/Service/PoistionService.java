package com.example.demo.service;

import com.example.demo.domain.dto.request.CreatePositionDTO;
import com.example.demo.domain.dto.response.PositionResponseDTO;

import java.util.List;

public interface PoistionService {
    List<PositionResponseDTO> getAllPosition();
    PositionResponseDTO getPositionById(long id);
    PositionResponseDTO createPosition(CreatePositionDTO createPositionDTO);
    PositionResponseDTO deletePositionByid(long id);
}
