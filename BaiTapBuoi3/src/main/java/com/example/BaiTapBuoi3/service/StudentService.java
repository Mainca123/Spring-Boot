package com.example.BaiTapBuoi3.service;

import com.example.BaiTapBuoi3.entity.Student;

import java.util.List;

public interface StudentService {
    public void add(Student student);
    public List<Student> getStudent();
    public Student findStudentById(long Id);
    public void deleteStudent(Student student);
}

