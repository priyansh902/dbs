package com.priyansh.dbs.Student;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class StudentService {
    
     private final Repository repository;

    private final StudentMapper studentMapper;

    public StudentService(Repository repository, StudentMapper studentMapper){
        this.repository = repository;
        this.studentMapper = studentMapper;
    }

    public StudentRespDto saveStudent(StudentDto studentDto){
           var student = studentMapper.toStudent(studentDto);
         var saved = repository.save(student);
         return studentMapper.studentRespDto(saved);
    }

    
    public List<Student> getstudent(){
        return repository.findAll();
    }

     public Student getByid( Integer id ){
        return repository.findById(id).orElse(new Student());
    }

     public List <Student> getnamStudent( String name) {
        return repository.findByName(name);
    }

    public void delete( Integer id){
        repository.deleteById(id);
    } 

  
    public Student stuString(  Student student){
        return repository.save(student);
    }  

}
