package com.hjy.service;

import com.hjy.pojo.Student;

import java.util.List;

public interface StudentService {
    public Student findById(int id);
    public int updateStudent(Student student);
    public int insertStudent(Student student);
    public int delStudent(int id);
    public List<Student> selectAll(Student student);
}
