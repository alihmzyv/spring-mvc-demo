package com.luv2code.springdemo.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //mvc controller
public class HomeController {
    @RequestMapping("/")
    public String showMyPage() {
        return "main-menu.jsp";
    }
}
