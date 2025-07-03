package com.priyansh.dbs.Student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(
     @NotEmpty(message = "name cant be empty")
     String name,
     
     String email,

     int age,
     
     Integer Schoolid
) {

    

   

    

    
}
    
