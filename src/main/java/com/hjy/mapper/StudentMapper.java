package com.hjy.mapper;

import com.hjy.pojo.Student;

import java.util.List;

public interface StudentMapper {
    public Student findById(int id);
    public int updateStudent(Student student);
    public int insertStudent(Student student);
    public int delStudent(int id);
    public List<Student> selectAll();
}
