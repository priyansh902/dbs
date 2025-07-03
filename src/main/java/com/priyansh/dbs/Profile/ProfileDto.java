package com.priyansh.dbs.Profile;

import jakarta.validation.constraints.NotEmpty;

public record ProfileDto(
    @NotEmpty
    String bio
) {
    
}
