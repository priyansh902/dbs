package com.priyansh.dbs.Profile;

import com.priyansh.dbs.Student.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class StudentProfile {
    
    @Id
    @GeneratedValue
    private Integer id;

    private String bio;

    @OneToOne
    @JoinColumn(
        name = "Student_id"
    )
    private Student student;

    public StudentProfile(String bio){
        this.bio = bio;
    }

    public StudentProfile(){

    }

    public void setid(Integer id){
        this.id = id;
    }

    public void setbio(String bio){
        this.bio = bio;
    }

    public Integer getid(){
        return id;
    }
    public String getbio(){
        return bio;
    }
}
