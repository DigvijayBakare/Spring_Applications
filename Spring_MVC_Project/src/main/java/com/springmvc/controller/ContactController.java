package com.springmvc.controller;


import com.springmvc.model.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
    @Autowired
    private UserService userService;
    @ModelAttribute
    public void commonData(Model model) {
        model.addAttribute("Header", "Registration form");
        model.addAttribute("Desc", "Registration form submitted successfully!!!");
    }

    @RequestMapping("/contact")
    public String showForm(Model m) {
//        m.addAttribute("Header", "Registration form");
        return "contact";
    }

    /*@RequestMapping(path = "/processForm", method = RequestMethod.POST)
    public String handleForm(@RequestParam("email") String userEmail, @RequestParam("name") String userName,
                             @RequestParam("pass") String userPass, Model model) {
//        System.out.println("User email: " + userEmail + "\nUser name: " + userName + "\nUser password: " + userPass );

        User user = new User();
        user.setEmail(userEmail);
        user.setName(userName);
        user.setPass(userPass);

        System.out.println(user);

        *//*model.addAttribute("email", userEmail);
        model.addAttribute("name", userName);
        model.addAttribute("pass", userPass);*//*

        model.addAttribute("user", user);
        return "success";
    }*/

    @RequestMapping(path = "/processForm", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model) {
        System.out.println(user);
        if (user.getEmail().isEmpty()){
            return "redirect:/contact";
        }
        int createdUser = this.userService.createUser(user);
        model.addAttribute("msg", "User created with id: " + createdUser);
        return "success";
    }
}
