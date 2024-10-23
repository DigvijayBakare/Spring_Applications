package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
    @RequestMapping("/one")
    public RedirectView one() {
        System.out.println("This is one handler");
//        return "redirect:/two";
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://www.google.com");
        return redirectView;
    }
    @RequestMapping("/two")
    public String two() {
        System.out.println("This is two handler");
        return "";
    }
}
