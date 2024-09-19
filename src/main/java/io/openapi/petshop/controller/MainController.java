package io.openapi.petshop.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.openapi.petshop.dto.PetDto;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class MainController {

    @RequestMapping(value = "/pets", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public PetDto getPets(){
        PetDto petDto = new PetDto(1L, "Ben", LocalDateTime.now());
        petDto.setDateBirthday(LocalDate.now());
        petDto.setName("Jack");
        return petDto;
    }

}

