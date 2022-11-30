package com.example.springbootcurd.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "stutab")
public class Student    {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid")
    private Integer studentId;
    @Column(name = "sname")
    private String studentName;
    @Column(name = "saddr")
    private String studentAddr;
    @Column(name = "savg")
    private Double studentAvg;
}