package com.priyansh.dbs.Student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentMapperTest {

    private StudentMapper studentMapper;
    

    @BeforeEach
    void setup(){
        studentMapper = new StudentMapper();
        System.out.println("run succesfully");
    }

  @Test
  public void ShouldmapTest() {

    //Given
    StudentDto studentDto = new StudentDto("rom", "rom@gmail.com", 22,152);

    //when
    Student student = studentMapper.toStudent(studentDto);

    //Then
    Assertions.assertEquals(studentDto.name(), student.getname());
     Assertions.assertEquals(studentDto.email(), student.getemail());
     Assertions.assertEquals(studentDto.age(), student.getage());
      Assertions.assertNotNull(student.getSchool());
      Assertions.assertEquals(studentDto.Schoolid(), student.getSchool().getid());
      System.out.println("running");

  }

  @Test
  public void testt() {
    Student student = new Student("ro", "rob@gmail.com", 20);

    StudentRespDto studentRespDto = studentMapper.studentRespDto(student);

     Assertions.assertEquals( student.getname(), studentRespDto.name());
     Assertions.assertEquals( student.getemail(),studentRespDto.email());
     Assertions.assertEquals( student.getage(),studentRespDto.age());
  }
  

    
}
