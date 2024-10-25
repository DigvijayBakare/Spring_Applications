    package com.springmvcsearch.dao;

import com.springmvcsearch.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


    @Repository
public class StudentDao {
    @Autowired
    private HibernateTemplate template;

    @Transactional
    public Long saveUser(Student user) {
        Long r = (Long)this.template.save(user);
        return r;
    }
}
