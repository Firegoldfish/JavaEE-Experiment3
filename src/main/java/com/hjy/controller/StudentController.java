package com.hjy.controller;

import com.hjy.pojo.Student;
import com.hjy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/List.action")
    public String list(int id, String name, Integer age, String gender, String address, Model model, HttpServletRequest request){
        Student student = new Student();
        student.setId(id);
        if(name==null)name="";
        student.setName(name);
        student.setAge(age);
        if(gender==null)gender="";
        student.setGender(gender);
        if(address==null)address="";
        student.setAddress(address);
        System.out.println(student);
        List<Student> students=new ArrayList<Student>();
        students=(List<Student>) studentService.selectAll(student);
        Integer rows=0;
        for(Student student1:students) {
            System.out.println(student1);
            rows++;
        }
        if(rows==0) {model.addAttribute("msg", "此学生不存在。");return "student";}
        model.addAttribute("students", students);
        return "findstudent";
    }
    @RequestMapping("/tocreate.action")
    public String tocreate() {return "createstudent";}
    @RequestMapping("/tostudent.action")
    public String tostudent() {return "student";}
    @RequestMapping("/create.action")
    public String create(String name,Integer age,String gender,String number,String address,Integer status,Model model) {
        Student student=new Student();
        student.setName(name);
        student.setAge(age);
        if(gender==null)gender="";
        student.setGender(gender);
        student.setNumber(number);
        if(address==null)address="";
        student.setAddress(address);
        if(status==null)status=1;
        student.setStatus(status);
        int rows=studentService.insertStudent(student);
        if(rows>0) {
            model.addAttribute("msg","添加成功");
        }else {
            model.addAttribute("msg","添加失败");
        }
        return "student";
    }
    @RequestMapping("/toupdate.action")
    public String toupdate(Integer id,Model model) {
        Student student=studentService.findById(id);
        model.addAttribute("student", student);
        return "updatestudent";
    }
    @RequestMapping("/update.action")
    public String update(Integer id,String name,Integer age,String gender,String number,String address,Integer status,Model model) {
        Student student=new Student();
        student.setId(id);
        if(name==null)name="";
        student.setName(name);
        student.setAge(age);
        if(gender==null)gender="";
        student.setGender(gender);
        if(number==null)number="";
        student.setNumber(number);
        if(address==null)address="";
        student.setAddress(address);
        student.setStatus(status);
        System.out.println(student.toString());
        int rows=studentService.updateStudent(student);
        if(rows>0) {
            model.addAttribute("msg","修改成功");
        }else {
            model.addAttribute("msg","修改失败"); }
        return "student";
    }
    @RequestMapping("/todelete.action")
    public String delete(Integer id,Model model) {
        int rows=studentService.delStudent(id);
        if(rows>0) {
            model.addAttribute("msg","删除成功");
        }else {
            model.addAttribute("msg","删除失败");
        }
        return "student";
    }
}
