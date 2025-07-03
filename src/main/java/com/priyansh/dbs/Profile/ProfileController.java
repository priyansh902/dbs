package com.priyansh.dbs.Profile;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class ProfileController {
    
   private final ProfileService profileService;

    public ProfileController(ProfileService profileService){
        this.profileService= profileService;
    }

     @PostMapping("/profile")
    public ProfileDto create(
      @Valid  @RequestBody ProfileDto profileDto
    ) {
       return profileService.create(profileDto);
    }

   
}
