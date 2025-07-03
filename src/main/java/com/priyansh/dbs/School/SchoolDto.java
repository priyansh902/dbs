package com.priyansh.dbs.School;

import jakarta.validation.constraints.NotEmpty;

public record SchoolDto(
    @NotEmpty
    String name
) {
} 
