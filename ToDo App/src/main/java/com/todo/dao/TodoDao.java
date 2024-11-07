package com.todo.dao;

import com.todo.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class TodoDao {
    @Autowired
    private HibernateTemplate template;

    @Transactional
    public int save(ToDo t) {
        Integer i = (Integer) this.template.save(t);
        return i;
    }
    public List<ToDo> getAll() {
        List<ToDo> list = this.template.loadAll(ToDo.class);
        return list;
    }
}
