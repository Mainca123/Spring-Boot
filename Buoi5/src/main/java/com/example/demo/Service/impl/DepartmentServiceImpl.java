package com.example.demo.service.impl;

import com.example.demo.constant.ErrorMessage;
import com.example.demo.domain.dto.request.CreateDepartmentDTO;
import com.example.demo.domain.dto.request.UpdateDepartmentDTO;
import com.example.demo.domain.dto.response.DepartmentResponseDTO;
import com.example.demo.domain.entity.Department;
import com.example.demo.domain.mapper.DepartmentMapper;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;

    @Override
    public List<DepartmentResponseDTO> getAllDepartment() {
        return departmentMapper.toDepartmentResponseDTOList(departmentRepository.findAll());
    }

    @Override
    public DepartmentResponseDTO getDepartmentById(long id) {
        Department department = departmentRepository.findById(id).orElseThrow(()
                -> new NotFoundException(ErrorMessage.Department.ERR_NOT_FOUND_ID, new long[] {id}));
        return departmentMapper.toDepartmentResponseDTO(department);
    }

    @Override
    public DepartmentResponseDTO createDepartment(CreateDepartmentDTO createDepartmentDTO) {
        Department department = departmentMapper.toDepartment(createDepartmentDTO);
        Department saveDepartment =departmentRepository.save(department);
        return departmentMapper.toDepartmentResponseDTO(saveDepartment);
    }

    @Override
    public DepartmentResponseDTO deleteDepartmentById(long id) {
        Department department = departmentRepository.findById(id).orElseThrow(()
        -> new NotFoundException(ErrorMessage.Department.ERR_NOT_FOUND_ID, new long[] {id}));
        departmentRepository.deleteById(id);
        return departmentMapper.toDepartmentResponseDTO(department);
    }

    @Override
    public DepartmentResponseDTO updateDepartment(long id, UpdateDepartmentDTO updateDepartmentDTO) {
        Department department = departmentRepository.findById(id).orElseThrow(()
        -> new NotFoundException(ErrorMessage.Department.ERR_NOT_FOUND_ID, new long[] {id}));
        department = departmentMapper.updateDepartment(department, updateDepartmentDTO);
        return departmentMapper.toDepartmentResponseDTO(departmentRepository.save(department));
    }
}
