package com.example.demo.domain.mapper;

import com.example.demo.domain.dto.request.CreateDepartmentDTO;
import com.example.demo.domain.dto.request.UpdateDepartmentDTO;
import com.example.demo.domain.dto.response.DepartmentResponseDTO;
import com.example.demo.domain.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    Department toDepartment(CreateDepartmentDTO createDepartmentDTO);
    DepartmentResponseDTO toDepartmentResponseDTO(Department department);
    List<DepartmentResponseDTO> toDepartmentResponseDTOList(List<Department> departments);
    Department updateDepartment(@MappingTarget Department department, UpdateDepartmentDTO updateDepartmentDTO);
}
