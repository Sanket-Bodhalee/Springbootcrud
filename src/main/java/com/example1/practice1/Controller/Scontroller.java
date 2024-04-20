package com.example1.practice1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example1.practice1.Entity.Student;
import com.example1.practice1.services.Sservice;

@RestController
public class Scontroller {
    
    @Autowired
    private Sservice sservice;

    @PostMapping("/register")
    public Student student( @RequestBody Student student)
    {
        return sservice.RegisterStudent(student);
    }

    @GetMapping("/getall")
    public List<Student> student()
    {
        return sservice.GetAll();
    }

    @GetMapping("/getByid/{id}")
    public Student studenta(@PathVariable Integer id)
    {
        return sservice.GetAllById(id);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deletStudentbyId(@PathVariable Integer id)
    {
        sservice.deleteStudent(id);
        return "student deleated successsfully";
    }
    
    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@RequestBody Student student,@PathVariable Integer id)
    {
      return sservice.update(student, id);
    }

}
