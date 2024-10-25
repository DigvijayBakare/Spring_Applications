package com.springmvcsearch.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
    @RequestMapping("/home")
    public String home() {
        System.out.println("Home View");
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
}
