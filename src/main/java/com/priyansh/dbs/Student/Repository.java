package com.priyansh.dbs.Student;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Student,Integer >  {
    List<Student> findByName(String name);
   
    
}
