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

    @GetMapping("AIrecommand")
    public ModelAndView AIrecommand(ModelAndView model){
        System.out.println("AIrecommand");
        model.setViewName("AIrecommand");
        return model;
    }
    @GetMapping("community")
    public ModelAndView community(ModelAndView model){
        System.out.println("community");
        model.setViewName("community");
        return model;
    }
    @GetMapping("productRating")
    public ModelAndView productRating(ModelAndView model){
        System.out.println("productRating");
        model.setViewName("productRating");
        return model;
    }

    @GetMapping("productRecommand")
    public ModelAndView productRecommand(ModelAndView model){
        System.out.println("productRecommand");
        model.setViewName("productRecommand");
        return model;
    }

    @GetMapping("mypage")
    public ModelAndView mypage(ModelAndView model){
        System.out.println("mypage");
        model.setViewName("mypage");
        return model;
    }

    @GetMapping("flask")
    public ModelAndView flask(ModelAndView model){
        System.out.println("flask");
        model.setViewName("flask");
        return model;
    }


}
