package com.api.controller;

import com.api.entity.Registration;
import com.api.payload.RegistrationDto;
import com.api.service.RegistrationService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import java.util.List;

@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController {


    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping
    public ResponseEntity<List<RegistrationDto>> getAll(){
        List<RegistrationDto> dtos = registrationService.getAllRegistration();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> createReg(
           @Valid @RequestBody RegistrationDto registrationDto,
           BindingResult result
    ){
        if(result.hasErrors()){
            return new ResponseEntity<>(result.getFieldError().getDefaultMessage(),HttpStatus.CREATED);
        }
        RegistrationDto dto = registrationService.createRegistration(registrationDto);
        return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Registration> updateReg(
            @PathVariable long id,
            @RequestBody Registration registration
    ){
        Registration reg = registrationService.updateRegistration(id, registration);
        return new ResponseEntity<>(reg,HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteReg(
            @RequestParam long id
    ){
        registrationService.deleteRegistration(id);
        return new ResponseEntity<>("Deleted",HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Registration> findReg(@PathVariable long id){
        Registration registration = registrationService.findRegistration(id);

        return new ResponseEntity<>(registration,HttpStatus.OK);
    }
}
