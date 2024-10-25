package com.springmvcsearch.service;

import com.springmvcsearch.entity.Student;
import com.springmvcsearch.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public Long createUser(Student student) {
        return this.studentDao.saveUser(student);
    }
}
