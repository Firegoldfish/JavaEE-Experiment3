package com.hjy.service;

import com.hjy.dao.StudentDao;
import com.hjy.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;
    public List<Student> selectAll(Student student){
        return this.studentDao.selectAll(student);
    }
    public int insertStudent(Student student){
        return this.studentDao.insertStudent(student);
    }
    public int updateStudent(Student student){
        return this.studentDao.updateStudent(student);
    }
    public int delStudent(int id){
        return this.studentDao.delStudent(id);
    }
    public Student findById(int id){
        return this.studentDao.findById(id);
    }
}
