package com.priyansh.dbs.Student;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.priyansh.dbs.Profile.StudentProfile;
import com.priyansh.dbs.School.School;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(unique = true)
    private String email;
    
    private int age;

    public Student(){
        
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
        name = "school_id"
    )
    @JsonBackReference
    private School school;

    @OneToOne(
        mappedBy = "student",
        cascade = CascadeType.ALL
        
    )
    private StudentProfile studentProfile;

    public void setschool(School school){
        this.school = school;
    }
    public void setstudentprofile(StudentProfile studentProfile){
        this.studentProfile= studentProfile;
    }

    public StudentProfile getsStudentProfile(){
        return studentProfile;
    }

    public School getSchool(){
        return school;
    }


    public Student(String name, String email, int age){
        this.name = name;
        this.email= email;
        this.age = age;
    }

    public void setid(Integer id){
        this.id = id;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setemail(String email){
        this.email=email;
    }
    public void setage(int age){
        this.age= age;
    }

    public Integer getid(){
        return id;
    }

    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public int getage(){
        return age;
    }
}
