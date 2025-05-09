package com.example.demo.service.impl;

import com.example.demo.constant.ErrorMessage;
import com.example.demo.domain.dto.request.CreatePositionDTO;
import com.example.demo.domain.dto.response.PositionResponseDTO;
import com.example.demo.domain.entity.Position;
import com.example.demo.domain.mapper.PositionMapper;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.PositionRepository;
import com.example.demo.service.PoistionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PositionServiceImpl implements PoistionService {

    private final PositionMapper positionMapper;
    private final PositionRepository positionRepository;

    @Override
    public List<PositionResponseDTO> getAllPosition() {
        return positionMapper.toPositionResponseDTOList(positionRepository.findAll());
    }

    @Override
    public PositionResponseDTO getPositionById(long id) {
        Position position = positionRepository.findById(id).orElseThrow(()
        -> new NotFoundException(ErrorMessage.Position.ERR_NOT_FOUND_ID, new long[]{id}));
        return positionMapper.toPositionResponseDTO(position);
    }

    @Override
    public PositionResponseDTO createPosition(CreatePositionDTO createPositionDTO) {
        Position position = positionMapper.toPosition(createPositionDTO);
        return positionMapper.toPositionResponseDTO(positionRepository.save(position));
    }

    @Override
    public PositionResponseDTO deletePositionByid(long id) {
        Position position = positionRepository.findById(id).orElseThrow(()
        -> new NotFoundException(ErrorMessage.Position.ERR_NOT_FOUND_ID, new long[] {id}));
        positionRepository.delete(position);
        return positionMapper.toPositionResponseDTO(position);
    }
}
