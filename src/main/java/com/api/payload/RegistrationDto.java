package com.api.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationDto {

    @NotEmpty
    @Size(min=2, message = "Minimum should be 2 letters")
    private String name;

    @Email
    private String Email;

    @Size(min=10, max = 10, message = "Should be 10 digits")
    private String Mobile;
}
