package com.last.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class startcontroller {

    @GetMapping("index")
    public ModelAndView index(ModelAndView model){
        System.out.println("index");
        model.setViewName("index");
        return model;
    }
    @GetMapping("login")
    public ModelAndView login(ModelAndView model){
        System.out.println("login");
        model.setViewName("login");
        return model;
    }
}
