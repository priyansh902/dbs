package com.priyansh.dbs.Student;


import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;



@RestController
@ResponseStatus(HttpStatus.CREATED)
public class Controller {

   private final StudentService studentService;

    public Controller(StudentService studentService){
       this.studentService = studentService;
    }
    
    // @GetMapping("/hello")
    // public String hello(){
    //     return "Hello my name is priyansh";
    // }

  

     @PostMapping("/post-student")
    public Student stuString(@RequestBody  Student student){
        return studentService.stuString(student);
    }

    @GetMapping("/students")
    public List<Student> getstudent(){
        return studentService.getstudent();
    }

    @GetMapping("/getid/{student-id}")
    public Student getByid(@PathVariable ("student-id") Integer id ){
        return studentService.getByid(id);
    }

    @GetMapping("/student/search/{student-name}")
    public List <Student> getnamStudent(@PathVariable ("student-name") String name) {
        return studentService.getnamStudent(name);
    }


      @PostMapping("/post")
    public String messString(@RequestBody  String message){
        return "my name is: "+ message;
    }

    @PostMapping("/post-dto")
    public StudentRespDto saveStudent(
       @Valid @RequestBody StudentDto studentDto
    ) {
        return this.studentService.saveStudent(studentDto);
    }

    
    @DeleteMapping("/student/delete/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable ("student-id") Integer id){
        studentService.delete(id);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentException(MethodArgumentNotValidException exp){
        var errors = new HashMap<String,String>();

        exp.getBindingResult().getAllErrors()
        .forEach( error -> {
            var fieldname = ((FieldError) error).getField();
            var errormessage = error.getDefaultMessage();
            errors.put(fieldname, errormessage);
        });

        return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);

    }
    

}
