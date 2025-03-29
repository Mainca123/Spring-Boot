package com.example.BaiTapBuoi3.service.impl;

import com.example.BaiTapBuoi3.entity.Student;
import com.example.BaiTapBuoi3.repository.StudentRepository;
import com.example.BaiTapBuoi3.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    public void add(Student student){
        studentRepository.save(student);
    }

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    public Student findStudentById(long id){
        return studentRepository.findById(id).orElse(null);
    }

    public void deleteStudent(Student student){
        studentRepository.delete(student);
    }
}
