package org.example.Repository;

import org.example.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;
    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s){
        String query = "insert into student(rollNo,name,marks) values (?,?,?)";
        int rows = jdbc.update(query,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println("Adding data:- "+rows);
    }

    public List<Student> findAll() {
        String query = "select * from student";

        RowMapper<Student> mapper = (rs, rowNum)->{
                Student s = new Student();
                s.setRollNo(rs.getInt("rollNo"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));

                return s;
        };

        return jdbc.query(query,mapper);
    }
}
