package com.concretepage;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.concretepage.entity.Person;

public class SpringDemo {
  public static void main(String... args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("db-config.xml");
      PersonDAO personDAO=(PersonDAO)context.getBean("personDAO");

      //Add
      Person p1 = new Person();
      p1.setPid(100);
      p1.setName("Mahesh");
      p1.setCity("Varanasi");
      personDAO.addPerson(p1);

      Person p2 = new Person();
      p2.setPid(200);
      p2.setName("Ram");
      p2.setCity("Ayodhya");
      personDAO.addPerson(p2);
      
      //Get
      Person p = personDAO.getPersonById(200);
      System.out.println(p.getPid() + "|" + p.getName() +"|"+ p.getCity());
      
      //Update
      p1.setName("Shiv");
      p1.setCity("Kashi");
      personDAO.updatePerson(p1);
      
      //Get All
      List<Person> list = personDAO.getAllPersons();
      list.forEach(ob -> System.out.println(ob.getPid() + "|" + ob.getName() +"|"+ ob.getCity()));
      
      //Delete
      personDAO.deletePerson(100);
      personDAO.deletePerson(200);
  } 
} 
