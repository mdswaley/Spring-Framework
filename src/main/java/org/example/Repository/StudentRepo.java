package org.example.Repository;

import org.example.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepo {
    public void save(Student s){
        System.out.println("Added...");
    }

    public List<Student> findAll() {
        List<Student> arr = Arrays.asList(new Student(103,"Swaley",44));
        return arr;
    }
}
