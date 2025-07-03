package com.priyansh.dbs.School;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class SchoolService {


      private final SchoolRepo schoolRepo;
      private final SchoolMapper schoolMapper;

      public SchoolService (SchoolRepo schoolRepo, SchoolMapper schoolMapper){
        this.schoolRepo = schoolRepo;
        this.schoolMapper = schoolMapper;
      
      }

      
    public SchoolDto create( SchoolDto schoolDto ) {
        var school = schoolMapper.tSchool(schoolDto);
         schoolRepo.save(school);
         return schoolDto;
    }

      public List<SchoolDto> listoSchools(){
        return schoolRepo.findAll()
        .stream()
        .map(schoolMapper::toSchoolDto)
        .collect(Collectors.toList());

    }

    
}
