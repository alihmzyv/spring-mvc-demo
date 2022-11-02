package com.luv2code.springdemo.mvc.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class SillyController {
    @RequestMapping("/showForm")
    public String showForm() {
        return "silly";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }
}
