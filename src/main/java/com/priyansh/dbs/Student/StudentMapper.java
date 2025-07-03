package com.priyansh.dbs.Student;



import org.springframework.stereotype.Service;

import com.priyansh.dbs.School.School;

@Service
public class StudentMapper {
    
    public Student toStudent(StudentDto studentDto){
        var  student = new Student();
        student.setname(studentDto.name());
        student.setemail(studentDto.email());
        student.setage(studentDto.age());

        var school = new School();
        school.setid(studentDto.Schoolid());

        student.setschool(school);

        return student;

    }

    public StudentRespDto studentRespDto(Student student){
       return new StudentRespDto( student.getname(),
        student.getemail(),
        student.getage()
       
        
       );
    }

}
