package com.springmvcsearch;

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
