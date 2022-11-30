package com.example.springbootcurd.service.impl;


import java.util.List;
import java.util.Optional;

import com.example.springbootcurd.entity.Student;
import com.example.springbootcurd.repo.StudentRepository;
import com.example.springbootcurd.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository repo;

    private Student std;
    @Override
    public Integer saveStudent(Student std) {
        std = repo.save(std);
        return std.getStudentId();
    }

    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        return repo.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {

        Optional <Student> opt = repo.findById(id);
        if(opt.isEmpty()) {
            return null;
        }

        return opt.get();
    }

    @Override
    public void deleteStudentById(Integer id) {
        // TODO Auto-generated method stub
        repo.deleteById(id);
    }

    @Override
    public void updateStudent(Student std) {
        // TODO Auto-generated method stub
        repo.save(std);
    }

    @Transactional
    public Integer updateStudentAdd(Integer sid,String add){
        return repo.updateStudentAddById(sid ,add);
    }
}