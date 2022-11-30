package com.example.springbootcurd.controller;

import java.util.*;
import java.util.List;
import com.example.springbootcurd.entity.Student;
import com.example.springbootcurd.service.IStudentService;
import jakarta.persistence.Entity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
@Slf4j
public class StudentController {

    @Autowired
    private IStudentService service;
    private Student std;

    //save Student
    @PostMapping("/save")
    public ResponseEntity<String> saveStudent(@RequestBody Student std) {
        log.info("Saving Student info");
        ResponseEntity<String> response = null;

        //call the Service
        Integer id = service.saveStudent(std);
        String msg = "Student with id ' " + id + " ' is saved";
        return response = new ResponseEntity<String>(msg, HttpStatus.OK);
    }

    //get All Student
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAll() {
        ResponseEntity<List<Student>> response = null;

//        call the service
        List<Student> list = service.getAllStudents();
        response = new ResponseEntity<List<Student>>(list, HttpStatus.OK);
        return response;
    }

    //get Student by id
    @GetMapping("/get/{sid}")
    public ResponseEntity<Student> getOneStudent(@PathVariable Integer sid) {
        ResponseEntity<Student> response = null;

//        call the service
        Student std = service.getStudentById(sid);
        response = new ResponseEntity<Student>(std, HttpStatus.OK);
        return response;
    }

    //Update Student
    @PutMapping("/update")
    public ResponseEntity<String> updateStudent(@RequestBody Student sid) {
        ResponseEntity<String> response = null;

        //   call the service
        service.updateStudent(sid);
        String msg = "update student data";
        response = new ResponseEntity<String>(msg, HttpStatus.OK);
        return response;

    }

    //	delete Student id
    @DeleteMapping("/delete/{sid}")
    public ResponseEntity<String> deleteOneStudent(@PathVariable Integer sid) {
        ResponseEntity<String> response = null;

        //   call the service
        service.deleteStudentById(sid);
        String msg = "Delete student data";
        response = new ResponseEntity<String>(msg, HttpStatus.OK);
        return response;
    }
    //partial update query
    @PatchMapping("/modify/{sid}/{add}")
    public ResponseEntity<String> updateStudentAddress(@PathVariable Integer sid, @PathVariable String add) {
        ResponseEntity<String> response = null;

        //   call the service
        Integer id = service.updateStudentAdd(sid,add);
        String msg = "Student address with id ' \" + id + \" ' is updated";
        response = new ResponseEntity<String>(msg, HttpStatus.OK);
        return response;
    }

    }