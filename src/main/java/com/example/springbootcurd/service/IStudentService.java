package com.example.springbootcurd.service;

import java.util.List;

import com.example.springbootcurd.entity.Student;

public interface IStudentService {

    //save student
    Integer saveStudent(Student std);

    //get all student
    List<Student> getAllStudents();

    //get student by id
    Student getStudentById(Integer id);

    //update
    void updateStudent(Student std);

    //delete student by id
    void deleteStudentById(Integer id);

    //partial update
    Integer updateStudentAdd(Integer sid,String add);

}