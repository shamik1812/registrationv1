package com.api.service;

import com.api.entity.Registration;
import com.api.exception.ResourceNotFound;
import com.api.payload.RegistrationDto;
import com.api.repository.RegistrationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RegistrationService {

    private RegistrationRepository registrationRepository;
    private ModelMapper modelMapper;

    public RegistrationService(RegistrationRepository registrationRepository, ModelMapper modelMapper) {
        this.registrationRepository = registrationRepository;
        this.modelMapper = modelMapper;
    }


    public List<RegistrationDto> getAllRegistration(){
        List<Registration> registrations = registrationRepository.findAll();
        List<RegistrationDto> dtos = registrations.stream().map(r -> maptoDto(r)).collect(Collectors.toList());
        return dtos;
    }

    public RegistrationDto createRegistration(RegistrationDto registrationDto) {
        Registration reg = maptoEntity(registrationDto);
        Registration savedEntity = registrationRepository.save(reg);
        RegistrationDto dto = maptoDto(savedEntity);
        return dto;
    }

    Registration maptoEntity(RegistrationDto Dto){
        Registration reg = modelMapper.map(Dto, Registration.class);
//        Registration reg = new Registration();
//        reg.setName(Dto.getName());
//        reg.setEmail(Dto.getEmail());
//        reg.setMobile(Dto.getMobile());
        return reg;
    }

    RegistrationDto maptoDto(Registration reg){
        RegistrationDto dto = modelMapper.map(reg, RegistrationDto.class);
//        RegistrationDto dto = new RegistrationDto();
//        dto.setName(reg.getName());
//        dto.setEmail(reg.getEmail());
//        dto.setMobile(reg.getMobile());
        return dto;
    }
    public Registration updateRegistration(long id, Registration registration) {
        Registration r = registrationRepository.findById(id).get();
         r.setName(registration.getName());
         r.setEmail(registration.getEmail());
         r.setMobile(registration.getMobile());
        Registration saved = registrationRepository.save(r);
        return saved;
    }

    public void deleteRegistration(long id) {
        registrationRepository.deleteById(id);
    }

    public Registration findRegistration(long id) {
        Registration registration = registrationRepository.findById(id).orElseThrow(
                ()->new ResourceNotFound("Record Not Present")
        );
        return registration;
    }
}
