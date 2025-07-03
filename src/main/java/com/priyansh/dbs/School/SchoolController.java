package com.priyansh.dbs.School;

import java.util.List;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class SchoolController {

  private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService){
        this.schoolService = schoolService;
    }

    @PostMapping("/school")
    public SchoolDto create(
      @Valid  @RequestBody SchoolDto schoolDto
    ) {
        return schoolService.create(schoolDto);
    }

   

    @GetMapping("/schools")
    public List<SchoolDto> listoSchools(){
        return schoolService.listoSchools();

    }

   


    
}
