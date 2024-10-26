package com.springmvcsearch.controller;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
    @RequestMapping("/home")
    public String home() {
        System.out.println("Home View");
        String str = null;
        System.out.println(str.length());
        return "home";
    }

    @RequestMapping("/search")
    public RedirectView search(@RequestParam("queryBox") String query) {
        System.out.println("search controll");
        String url = "https://www.google.com/search?q="+query;
        RedirectView rv = new RedirectView();
        if (query.isEmpty()) {
            rv.setUrl("redirect:/home");
        } else {
            rv.setUrl(url);
        }
        return rv;
    }

    @RequestMapping("/user/{id}")
    public String getDetails(@PathVariable("id") int id) {
        System.out.println(id);
        return "home";
    }


//    // Handling exception in the spring mcx
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler({NullPointerException.class, NumberFormatException.class})
//    public String exceptionHandler(Model model) {
//        model.addAttribute("msg", "Null pointer or Number Format exception occurred!!");
//        return "errorPage";
//    }
//
//    @ExceptionHandler(value = Exception.class)
//    public String genericExceptionHandler(Model model) {
//        model.addAttribute("msg", "Exception occurred!!");
//        return "errorPage";
//    }
}
