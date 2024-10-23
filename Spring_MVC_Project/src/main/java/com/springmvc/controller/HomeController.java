package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("This is home url");
        model.addAttribute("name", "Ravi Yadav");
        model.addAttribute("id", 1224);

        List<String> friends = new ArrayList<>();
        friends.add("Mohan");
        friends.add("Madan");
        friends.add("Ravi");
        friends.add("Rohan");
        friends.add("Aditya");
        model.addAttribute("friends", friends);
        return "index";
    }
    @RequestMapping("/about")
    public String about() {
        System.out.println("This is about page");
        return "about";
    }
    @RequestMapping("/service")
    public String services() {
        System.out.println("This is services url");
        return "services";
    }
    @RequestMapping("/help")
    public ModelAndView help() {
        System.out.println("This is help page");

        //creating modelAndView object
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "Digvijay");     // setting the data
        modelAndView.addObject("roll", 1070);
        LocalDateTime now = LocalDateTime.now();
        modelAndView.addObject("time", now);

        // marks list
        List<Integer> marks = new ArrayList<>();
        marks.add(36);
        marks.add(45);
        marks.add(52);
        marks.add(62);

        modelAndView.addObject("marks", marks);

        modelAndView.setViewName("help");       // setting view name
        return modelAndView;
    }
}
