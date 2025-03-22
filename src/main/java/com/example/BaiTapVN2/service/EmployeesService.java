package com.example.BaiTapVN2.service;

import com.example.BaiTapVN2.entity.Employee;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface EmployeesService {
    public List<Employee> getEmployees();
    public void addEmployee(Employee employee);
    public void deleteEmployee(List<Long> ids);
    public Employee findEmployee(long id);
}
