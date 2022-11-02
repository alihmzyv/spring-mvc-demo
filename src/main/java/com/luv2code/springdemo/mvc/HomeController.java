package com.luv2code.springdemo.mvc;

import com.luv2code.springdemo.mvc.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHomePage() {
        return "main-page";
    }
}
