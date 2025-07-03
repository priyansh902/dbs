package com.priyansh.dbs.School;

import org.springframework.stereotype.Service;

@Service
public class SchoolMapper {

     public School tSchool(SchoolDto schoolDto){
        return new School(schoolDto.name());
    }

     public SchoolDto toSchoolDto( School school ) {
        return new SchoolDto(school.getname());
    }
    
}
