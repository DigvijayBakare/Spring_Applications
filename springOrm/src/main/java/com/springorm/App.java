package com.springorm;

import com.springorm.dao.StudentDao;
import com.springorm.entites.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//        Student student = new Student(101, "Digvijay Bakare", "Pune");
//        Student student = new Student(102, "Angad Raut", "Pune");
//        Student student = new Student(103, "Aaditya Kolapkar", "Pune");
//        Student student = new Student(104, "Vishnu Pasad", "Pune");
//        Student student = new Student(105, "Anant Dahiwade", "Pune");
//
//        int r = studentDao.insertStudent(student);
//
//        System.out.println(r + " Student data inserted...");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        while (go) {
            System.out.println("**********Welcome to spring orm project **********\n" +
                    "\n" +
                    "PRESS 1 to add new student\n" +
                    "PRESS 2 to display all students\n" +
                    "PRESS 3 to get detail's of single student\n" +
                    "PRESS 4 to delete a student\n" +
                    "PRESS 5 to update a student\n" +
                    "PRESS 6 to exit.."
            );
            try {
                System.out.print("Enter the choice to perform the operation: ");
                int input = Integer.parseInt(br.readLine());
                // using switch statement for the performing operations
                switch (input) {
                    case 1: // add new student
                        System.out.print("Enter the student id: ");
                        int id = Integer.parseInt(br.readLine());
                        System.out.print("Enter the student name: ");
                        String name = br.readLine();
                        System.out.print("Enter the student's city: ");
                        String city = br.readLine();
                        Student insert = new Student(id, name, city);
                        studentDao.insertStudent(insert);
                        System.out.println("Student data inserted successfully!!");
                        break;
                    case 2: // display all students
                        System.out.println("Students in the list are...");
                        List<Student> students = studentDao.getAllStudents();
                        for (Student s : students) {
                            System.out.println(s);
                        }
                        break;
                    case 3: // get single student
                        System.out.print("Enter the student id: ");
                        int sId = Integer.parseInt(br.readLine());
                        Student student = studentDao.getSingleStudent(sId);
                        System.out.println(student);
                        break;
                    case 4: // delete student
                        System.out.print("Enter the student id: ");
                        int i = Integer.parseInt(br.readLine());
                        studentDao.deleteStudent(i);
                        System.out.println("Student with id " + i + " deleted successfully!!");
                        break;
                    case 5: // update student

                        System.out.println("WHAT DO YOU WANT TO UPDATE\n" +
                                "PRESS 1 to Update Student name\n" +
                                "PRESS 2 to Update Student city\n" +
                                "PRESS 3 to Update both name and city");
                        int up = Integer.parseInt(br.readLine());
                        System.out.print("Enter the student id: ");
                        int idd = Integer.parseInt(br.readLine());
                        if (up == 1) {
                            System.out.print("Enter new name of student: ");
                            String newName = br.readLine();
                            Student updateName = new Student();
                            updateName.setId(idd);
                            updateName.setCity(studentDao.city(idd));
                            updateName.setName(newName);
                            studentDao.updateStudent(updateName);
                            System.out.println("Student name updated successfully!!");
                            break;
                        } else if (up == 2) {
                            System.out.print("Enter new city of student: ");
                            String newCity = br.readLine();
                            Student updateCity = new Student();
                            updateCity.setId(idd);
                            updateCity.setCity(newCity);
                            updateCity.setName(studentDao.name(idd));
                            studentDao.updateStudent(updateCity);
                            System.out.println("Student city updated successfully!!");
                            break;
                        } else if (up == 3) {
                            System.out.print("Enter new name of student: ");
                            String newName = br.readLine();
                            System.out.print("Enter new city of student: ");
                            String newCity = br.readLine();
                            Student both = new Student();
                            both.setId(idd);
                            both.setName(newName);
                            both.setCity(newCity);
                            studentDao.updateStudent(both);
                            System.out.println("Student's name and city updated successfully!!");
                            break;
                        } else {
                            System.out.println("Please enter correct option!!");
                        }
                        break;
                    case 6: // exit the loop
                        go = false;
                        System.out.println("Thank you for using my application!!!" +
                                "\nCome again!!!!");
                        break;
                    default:
                        System.out.println("Please enter correct operation choice!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input try the correct option!!");
                System.out.println(e.getMessage());
            }
        }
    }
}
