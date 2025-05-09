package com.example.demo.service.impl;

import com.example.demo.constant.ErrorMessage;
import com.example.demo.domain.dto.response.EmployeeResponseDTO;
import com.example.demo.domain.entity.CreateEmployeeDTO;
import com.example.demo.domain.entity.Employee;
import com.example.demo.domain.mapper.EmployeeMapper;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeMapper employeeMapper;
    private final EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeResponseDTO> getAllEmployees() {
        return employeeMapper.toEmployeeResponseDTOList(employeeRepository.findAll());
    }

    @Override
    public EmployeeResponseDTO getEmployeeById(long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()
        -> new NotFoundException(ErrorMessage.Employee.ERR_NOT_FOUND_ID, new long[] {id}));
        return employeeMapper.toEmployeeResponseDTO(employee);
    }

    @Override
    public EmployeeResponseDTO createEmployee(CreateEmployeeDTO createEmployeeDTO) {
        Employee employee = employeeMapper.toEmployees(createEmployeeDTO);
        employeeRepository.save(employee);
        return employeeMapper.toEmployeeResponseDTO(employee);
    }

    @Override
    public EmployeeResponseDTO deleteEmployeeByID(long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()
        -> new NotFoundException(ErrorMessage.Employee.ERR_NOT_FOUND_ID, new long[]{id}));
        employeeRepository.deleteById(id);
        return employeeMapper.toEmployeeResponseDTO(employee);
    }

    @Override
    public List<EmployeeResponseDTO> findEmployeeByFullName(String name) {
        return employeeMapper.toEmployeeResponseDTOList(employeeRepository.findByName(name));
    }

    @Override
    public EmployeeResponseDTO findEmployeeByDepartmentId(long id) {
        Employee employee = employeeRepository.findByDepartmentId(id);
        if(employee == null)
            throw new NotFoundException(ErrorMessage.Department.ERR_NOT_FOUND_ID, new long[] {id});
        return employeeMapper.toEmployeeResponseDTO(employee);
    }

    @Override
    public EmployeeResponseDTO findEmployeeByPositionId(long id) {
        Employee employee = employeeRepository.findByPositionId(id);
        if(employee == null)
            throw new NotFoundException(ErrorMessage.Position.ERR_NOT_FOUND_ID, new long[] {id});
        return employeeMapper.toEmployeeResponseDTO(employee);
    }

    @Override
    public List<EmployeeResponseDTO> findEmployeeByFullName_Salary(String name, double salary) {
        return employeeMapper.toEmployeeResponseDTOList(employeeRepository.findByName_Salary(name, salary));
    }
}
