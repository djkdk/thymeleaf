package com.qf.thymeleaf.controller;

import com.qf.thymeleaf.entity.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author
 * @Date ${Date}
 */
@Controller
@RequestMapping("view")
public class ThymeleafController {
    @RequestMapping("hello")
    public String hello(Model model){
        model.addAttribute("name","leijun");

        Teacher teacher=new Teacher(1,"aa",12);
        model.addAttribute("teacher",teacher);

        List<Teacher> list=new ArrayList<>();
        list.add(new Teacher(2,"bb",23));
        list.add(new Teacher(3,"cc",36));



        return "hello";
    }




}
