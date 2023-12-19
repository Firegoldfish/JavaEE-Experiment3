package com.hjy.service;

import com.hjy.mapper.StudentMapper;
import com.hjy.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;
    public List<Student> selectAll(){
        return this.studentMapper.selectAll();
    }
    public int insertStudent(Student student){
        return this.studentMapper.insertStudent(student);
    }
    public int updateStudent(Student student){
        return this.studentMapper.updateStudent(student);
    }
    public int delStudent(int id){
        return this.studentMapper.delStudent(id);
    }
    public Student findById(int id){
        return this.studentMapper.findById(id);
    }
}
