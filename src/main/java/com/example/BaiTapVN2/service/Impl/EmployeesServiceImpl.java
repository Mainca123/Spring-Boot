package com.example.BaiTapVN2.service.Impl;

import com.example.BaiTapVN2.entity.Employee;
import com.example.BaiTapVN2.repository.EmployeesRepository;
import com.example.BaiTapVN2.service.EmployeesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeesServiceImpl implements EmployeesService {
    private EmployeesRepository employeesRepository;
    public List<Employee> getEmployees() {
        return employeesRepository.findAll();
    }

    public void addEmployee(Employee employee){
        employeesRepository.save(employee);
    }

    public void deleteEmployee(List<Long> ids){
        for(long id:ids)
            employeesRepository.deleteById(id);
    }

    public Employee findEmployee(long id) {
        return employeesRepository.findById(id).orElse(null);
    }

}
