package com.hjy.controller;

import com.hjy.pojo.User;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

public class UserController {
    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession httpSession){
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        if(user.getUsername().equals("login")&&user.getPassword().equals("login")){
            return "student";
        }
        else {
            model.addAttribute("msg","账号或密码输入错误，请重试。");
            return "login";
        }
    }
    @RequestMapping(value = "/toStudent.action")
    public String toStudent(){
        return "student";
    }
    @RequestMapping(value = "/logout.action")
    public String logout(HttpSession httpSession, Model model){
        httpSession.invalidate();
        model.addAttribute("msg","已退出账户");
        return "login";
    }
}
