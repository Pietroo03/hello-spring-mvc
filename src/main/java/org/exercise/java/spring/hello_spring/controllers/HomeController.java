package org.exercise.java.spring.hello_spring.controllers;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(name = "name") String name, Model model) {

        model.addAttribute("name", name);
        model.addAttribute("currentDate", LocalTime.now());

        return "greetings";
    }
}
