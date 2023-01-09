package com.example.springbootcurd.repo;

import com.example.springbootcurd.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student ,Integer> {

    @Modifying
    @Query("Update Student SET studentAddr=:add Where studentId=:id")
    Integer updateStudentAddById(Integer id ,String add);
}