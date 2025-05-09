package com.example.demo.repository;

import com.example.demo.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e WHERE LOWER(e.fullName) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Employee> findByName(String name);

    @Query("SELECT e FROM Employee e WHERE e.department.id = :id")
    Employee findByDepartmentId(long id);

    @Query("SELECT e FROM Employee e WHERE e.position.id = :id")
    Employee findByPositionId(long id);

    @Query("SELECT e FROM Employee e WHERE (LOWER(e.fullName) LIKE LOWER(CONCAT('%', :name, '%')) and e.salary = :salary)")
    List<Employee> findByName_Salary(String name, double salary);
}
