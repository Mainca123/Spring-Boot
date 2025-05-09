package com.example.demo.controller;

import com.example.demo.base.RestApV1;
import com.example.demo.base.VsResponseUtil;
import com.example.demo.constant.UrlConstant;
import com.example.demo.domain.dto.request.CreateDepartmentDTO;
import com.example.demo.domain.dto.request.UpdateDepartmentDTO;
import com.example.demo.service.DepartmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestApV1
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping(UrlConstant.Department.GET_DEPARTMENTS) // " /departments/r "
    public ResponseEntity<?> getAllDepartment(){
        return VsResponseUtil.success(departmentService.getAllDepartment());
    }

    @GetMapping(UrlConstant.Department.GET_DEPARTMENT) // " /department/r/ "
    public ResponseEntity<?> getDepartmentByID(@PathVariable long id){
        return VsResponseUtil.success(departmentService.getDepartmentById(id));
    }

    @PostMapping(UrlConstant.Department.CREATE_DEPARTMENT) // " /department/c "
    public ResponseEntity<?> createDepartment(@Valid @RequestBody CreateDepartmentDTO createDepartmentDTO){
        return VsResponseUtil.success(departmentService.createDepartment(createDepartmentDTO));
    }

    @DeleteMapping(UrlConstant.Department.DELETE_DEPARTMENT) // " /department/d/ "
    public ResponseEntity<?> deleteDepartmentById(@PathVariable long id){
        return VsResponseUtil.success(departmentService.deleteDepartmentById(id));
    }

    @PutMapping(UrlConstant.Department.UPDATE_DEPARTMENT)
    public ResponseEntity<?> updateDepartment(@PathVariable long id, @RequestBody UpdateDepartmentDTO updateDepartmentDTO){
        return VsResponseUtil.success(departmentService.updateDepartment(id, updateDepartmentDTO));
    }
}
