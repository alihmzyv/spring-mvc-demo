package com.luv2code.springdemo.mvc.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processForm-v2")
    public String processFormV2(HttpServletRequest req, Model model) {
        String studentName = req.getParameter("studentName");
        String message = String.format("Hello, %s", studentName.toUpperCase());
        model.addAttribute("message", message);
        return "helloworld";
    }

    @RequestMapping("/processForm-v3")
    public String processFormV3(@RequestParam("studentName") String studentName, Model model) {
        String message = String.format("Hello, %s", studentName.toUpperCase());
        model.addAttribute("message", message);
        return "helloworld";
    }
}
