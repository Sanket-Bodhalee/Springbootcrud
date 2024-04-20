package com.example1.practice1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.practice1.Entity.Student;
import com.example1.practice1.Repository.Srepository;

@Service
public class SserviceImpl implements Sservice {

   @Autowired
   private Srepository srepository;


    @Override
    public Student RegisterStudent(Student student) {
        return srepository.save(student);
    }

    @Override
    public List<Student> GetAll() {
        List<Student> student=srepository.findAll();
        return student;
    }

    @Override
    public void deleteStudent(Integer id) {
         this.srepository.deleteById(id);
    }

    @Override
    public Student GetAllById(Integer id) {
        return srepository.findById(id).get();
        
    }

    @Override
    public Student update(Student student, Integer id) {
       Student stud=srepository.findById(id).get();
       stud.setName(student.getName());
       stud.setRoll(student.getRoll());
      return srepository.save(stud);
    }

    
    
}
