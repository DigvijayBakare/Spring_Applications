package com.springorm.dao;

import com.springorm.entites.Student;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;


@Repository
public class StudentDao {
    @Autowired
    @Getter
    @Setter
    private HibernateTemplate template;

    // save the object of student to the database
    @Transactional
    public int insertStudent(Student student) {
        // inserting a student
        Session session = template.getSessionFactory().getCurrentSession();
        session.setFlushMode(FlushMode.COMMIT);
        Integer r = (Integer) this.template.save(student);
        return r;
    }

    // get the single data (object)
    public Student getSingleStudent(int id) {
        Student student = this.template.get(Student.class, id);
        return student;
    }

    // getting all the data from the database
    public List<Student> getAllStudents() {
        List<Student> list = this.template.loadAll(Student.class);
        return list;
    }

    // deleting a single data from a database
    @Transactional
    public void deleteStudent(int id) {
        Student student = this.template.get(Student.class, id);
        this.template.delete(student);
    }

    // updating the data
    @Transactional
    public void updateStudent(Student student) {
        String spl = "UPDATE student_details SET student_name = ?, student_city = ? WHERE student_id = ?";
        this.template.update(spl, student);
    }
    public String name(int id) {
        String n = this.template.get(Student.class, id).getName();
        return n;
    }
    public String city(int id) {
        String n = this.template.get(Student.class, id).getCity();
        return n;
    }
}
