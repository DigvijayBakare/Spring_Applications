package com.todo.controller;

import com.todo.dao.TodoDao;
import com.todo.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletContext;
import java.util.Date;
import java.util.List;

@Controller
public class ControllerClass {
    @Autowired
    ServletContext context;

    @Autowired
    TodoDao todoDao;

    @RequestMapping("/home")
    public String home(Model model) {
        String str = "home";
        model.addAttribute("page", str);

//        List<ToDo> list = (List<ToDo>) context.getAttribute("list");
        List<ToDo> list = (List<ToDo>) this.todoDao.getAll();
        model.addAttribute("todos", list);

        return "home";
    }

    @RequestMapping("/add")
    public String addToDo(Model model) {
        ToDo toDo = new ToDo();
        model.addAttribute("page", "add");
        model.addAttribute("todo", toDo);
        return "home";
    }

    @RequestMapping(value = "/saveTodo", method = RequestMethod.POST)
    public String saveTodo(@ModelAttribute("todo") ToDo t, Model model) {
        model.addAttribute("page","home");
        System.out.println(t);
        t.setTodoDate(new Date());

        this.todoDao.save(t);

//        // getting list from context
//        List<ToDo> list = (List<ToDo>) context.getAttribute("list");
//        list.add(t);

        model.addAttribute("msg", "Successfully added");
        return "home";
    }
}
