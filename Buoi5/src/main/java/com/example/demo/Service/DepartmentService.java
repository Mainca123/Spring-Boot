package com.example.demo.service;

import com.example.demo.domain.dto.request.CreateDepartmentDTO;
import com.example.demo.domain.dto.request.UpdateDepartmentDTO;
import com.example.demo.domain.dto.response.DepartmentResponseDTO;

import java.util.List;

public interface DepartmentService {
    List<DepartmentResponseDTO> getAllDepartment();
    DepartmentResponseDTO getDepartmentById(long id);
    DepartmentResponseDTO createDepartment(CreateDepartmentDTO createDepartmentDTO);
    DepartmentResponseDTO deleteDepartmentById(long id);
    DepartmentResponseDTO updateDepartment(long id, UpdateDepartmentDTO updateDepartmentDTO);
}
