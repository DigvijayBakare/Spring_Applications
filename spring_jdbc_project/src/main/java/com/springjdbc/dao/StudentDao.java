package com.springjdbc.dao;

import com.springjdbc.entity.Student;

import java.util.List;

public interface StudentDao {
    int insert(Student student);
    int update(Student student);
    int delete(int studentId);
    public Student getSingleStudent(int studentId);
    public List<Student> getAllStudents();
}
