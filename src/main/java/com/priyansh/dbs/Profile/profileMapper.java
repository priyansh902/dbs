package com.priyansh.dbs.Profile;

import org.springframework.stereotype.Service;

@Service
public class profileMapper {
    
     public StudentProfile studentProfile(ProfileDto profileDto){
       return new StudentProfile(profileDto.bio());
       
    }
}
