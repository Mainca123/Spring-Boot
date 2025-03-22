package com.example.BaiTapVN2.repository;

import com.example.BaiTapVN2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee, Long>{}