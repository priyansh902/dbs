package com.priyansh.dbs.School;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.priyansh.dbs.Student.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class School {
    
    // school body param
    @Id
    @GeneratedValue
    private Integer id;

    private String name;


    //relationship
    @OneToMany(
        mappedBy = "school"
        
    )
    @JsonManagedReference
    private List<Student> student;

    public List<Student> getSchool(){
        return student;
    }

    public void setstu(List<Student> student){
        this.student = student;
    }

    public School(){

    }

    public School(String name){
        this.name = name;
    }

    public Integer getid(){
        return id;
    }

    public String getname(){
        return name;
    }

    public void setid(Integer id){
        this.id = id;
    }
    public void setname(String name){
        this.name = name;
    }

}
