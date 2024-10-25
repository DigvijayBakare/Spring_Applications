package com.springmvcsearch.controller;

import com.springmvcsearch.entity.Student;
import com.springmvcsearch.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/complex")
    public String showForm() {
        return "complexForm";
    }

    @RequestMapping(path = "/handleForm", method = RequestMethod.POST)
    public String formHandler(@ModelAttribute("student") Student student, Model model, BindingResult result) {
        if (result.hasErrors()) {
            return "complexForm";
        }

        System.out.println(student);
        if (student.getName().isEmpty()){
            return "redirect:/contact";
        }
        Long createdUser = this.studentService.createUser(student);
        model.addAttribute("msg", "User created with id: " + createdUser);
        return "success";
    }
}
