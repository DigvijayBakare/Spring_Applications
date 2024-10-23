package com.springmvc.daoImpl;

import com.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDaoImpl {
    @Autowired
    private HibernateTemplate template;

    @Transactional
    public int saveUser(User user) {
        int r = (int)this.template.save(user);
        return r;
    }
}
