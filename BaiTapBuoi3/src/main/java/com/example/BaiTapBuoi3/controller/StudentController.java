package com.example.BaiTapBuoi3.controller;

import com.example.BaiTapBuoi3.entity.Student;
import com.example.BaiTapBuoi3.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public String getStudent(Model model){
        List<Student> students = studentService.getStudent();
        model.addAttribute("students",students);
        return "student";
    }

    @PostMapping("/student/add")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        if (student.getName().isEmpty() || student.getEmail().isEmpty() ||
                student.getPhone().isEmpty() || student.getAddress().isEmpty()) {
            return ResponseEntity.badRequest().body("Thêm không thành công!");
        }

        studentService.add(student);
        return ResponseEntity.ok("Thêm thành công");
    }

}
