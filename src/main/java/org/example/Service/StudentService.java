package org.example.Service;

import org.example.Model.Student;
import org.example.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student){
        studentRepo.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }
}
