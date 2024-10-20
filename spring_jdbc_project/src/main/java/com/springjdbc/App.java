package com.springjdbc;

import com.springjdbc.config.JdbcConfig;
import com.springjdbc.dao.StudentDao;
import com.springjdbc.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Application started!!!!!");

        // Spring JDBC -> JdbcTemplate
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

        /*JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

        // insert query
        String insert = "insert into student values (?, ?, ?)";

        // fire the query
        int rows = template.update(insert, 111, "Mahesh", "Delhi");
        System.out.println("Number of records inserted: " + rows);*/

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        // inserting into the database
//        Student student = new Student(555, "Ram", "MP");
//        int r = studentDao.insert(student);
//        System.out.println(r + " Student added...");

        // updating the details
//        Student student = new Student(333, "Rudra", "Kashi");
//        int r = studentDao.update(student);
//        System.out.println(r + " Student data changed...");

        // delete operation
//        int r = studentDao.delete(444);
//        System.out.println(r + " Student data deleted...");

        // getting single student info only
//        Student student = studentDao.getSingleStudent(222);
//        System.out.println(student);

        // getting the list of student present in the database
        List<Student> students = studentDao.getAllStudents();
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
