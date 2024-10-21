package com.springjdbc.daoImpl;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        // insert query
        String insert = "insert into student values (?, ?, ?)";

        int r = this.jdbcTemplate.update(insert, student.getId(), student.getName(), student.getCity());
        return r;
    }

    @Override
    public int update(Student student) {
        // updating data
        String update = "update student set name = ?, city = ? where id = ?";
        int r = this.jdbcTemplate.update(update, student.getName(), student.getCity(), student.getId());
        return r;
    }

    @Override
    public int delete(int studentId) {
        // delete operation
        String delete = "delete from student where id = ?";
        int r = this.jdbcTemplate.update(delete, studentId);
        return r;
    }

    @Override
    public Student getSingleStudent(int studentId) {
        // selecting single student data
        String select = "select * from student where id = ?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student student = this.jdbcTemplate.queryForObject(select, rowMapper, studentId);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        // selecting multiple students
        String select = "select * from student";
        List<Student> students = this.jdbcTemplate.query(select, new RowMapperImpl());
        return students;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
