package com.example.springbootcurd.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Entity
@Slf4j
@Table(name = "Registration")
public class Student    {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid")
    private Integer studentId;
    
    @Column(name = "sname")
    private String studentName;
  
    @Column(name = "savg")
    private Double studentAvg;
    
    @Column(name = "email")
    private String studentemail;
    
    @Column(name = "mobileno")
    private Integer stumobileno;
    
    @Column(name = "saddr")
    private String studentAddr;


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAvg=" + studentAvg
				+ ", studentemail=" + studentemail + ", stumobileno=" + stumobileno + ", studentAddr=" + studentAddr
				+ "]";
	}


	public Integer getStudentId() {
		// TODO Auto-generated method stub
		return studentId;
	}
    
	
}