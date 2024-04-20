package com.example1.practice1.services;

import java.util.List;

import com.example1.practice1.Entity.Student;

public interface Sservice {
    
    public Student RegisterStudent(Student student);

    List<Student>  GetAll();

    public void deleteStudent(Integer id);
     public Student  GetAllById(Integer id);

     public Student update(Student student,Integer id);
}
