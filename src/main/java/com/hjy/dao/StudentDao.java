package com.hjy.dao;

import com.hjy.pojo.Student;

public interface StudentDao {
    public Student findById(int id);
    public Student findByName(String name);
    public int updateStudent(int id, String name, int age, String gender, String number, String address, int status);
    public int insertStudent(int id, String name, int age, String gender, String number, String address, int status);
    public int delStudent(int id);
}
