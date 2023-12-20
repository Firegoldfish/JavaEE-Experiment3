package com.hjy.controller;

import com.hjy.pojo.Student;
import com.hjy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/studentController")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @RequestMapping("/showTable")
    public String showTable(Integer id, String name, Integer age, String gender, String address, Model model, HttpServletRequest request){
        List<Student> students =studentService.selectAll();
        model.addAttribute("students", students);
        return "student";
    }
    @RequestMapping("/toInsert")
    public String toInsert() {return "insertStudent";}
    @RequestMapping("/insertStudent")
    public String insertStudent(Model model,HttpServletRequest httpServletRequest) {
        Student student=new Student();
        String name = httpServletRequest.getParameter("name");
        String age1 = httpServletRequest.getParameter("age");
        Integer age = Integer.parseInt(age1);
        String gender = httpServletRequest.getParameter("gender");
        String number = httpServletRequest.getParameter("number");
        String address = httpServletRequest.getParameter("address");
        String status1= httpServletRequest.getParameter("status");
        Integer status = Integer.parseInt(status1);
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
        return "insertStudent";
    }
    @RequestMapping("/toupdate")
    public String toupdate(Integer id,Model model) {
        Student student=studentService.findById(id);
        model.addAttribute("student", student);
        return "updatestudent";
    }
    @RequestMapping("/update")
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
    @RequestMapping("/delStudent")
    public String delStudent(Integer id, Model model) {
        int rows=studentService.delStudent(id);
        return "redirect:/studentController/showTable";
    }
}
