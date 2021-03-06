package com.asy.mongo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @GetMapping("/")
    public ModelAndView main(){
           return new ModelAndView("main");
    }

    @GetMapping("/list")
    public ModelAndView list(){
        return new ModelAndView("main");
    }

    @GetMapping("/create")
    public ModelAndView create(){
        return new ModelAndView("create");
    }
}
