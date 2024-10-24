    package com.springmvcsearch;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


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
