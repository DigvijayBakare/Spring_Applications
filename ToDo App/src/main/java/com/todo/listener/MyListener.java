package com.todo.listener;

import com.todo.entity.ToDo;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.ArrayList;
import java.util.List;

public class MyListener implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context created...");
        List<ToDo> list = new ArrayList<>();
        ServletContext sc = sce.getServletContext();
        sc.setAttribute("list", list);
    }
}
