package com.luv2code.springdemo.mvc.entity.controller;

import com.luv2code.springdemo.mvc.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @GetMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("countryOptions", Map.of("Brazil", "Brazil", "Turkey", "Turkey"));
        model.addAttribute("langOptions", Map.of("Java", "Java", "Python", "Python"));
        model.addAttribute("osOptions", Map.of("Windows", "Microsoft Windows", "Linux", "Linux"));
        return "student-form";
    }

    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "student-form";
        }
        return "student-confirmation";
    }
}
