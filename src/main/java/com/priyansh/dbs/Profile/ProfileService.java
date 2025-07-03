package com.priyansh.dbs.Profile;


import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    
     private final profileRepo ProfileRepo;

     private final profileMapper ProfileMapper;

     public ProfileService(profileRepo ProfileRepo, profileMapper ProfileMapper){
        this.ProfileMapper= ProfileMapper;
        this.ProfileRepo = ProfileRepo;
     }

      public ProfileDto create(
         ProfileDto profileDto
    ) {
        var profile = ProfileMapper.studentProfile(profileDto);
         ProfileRepo.save(profile);
         return profileDto;
         
    }
}
