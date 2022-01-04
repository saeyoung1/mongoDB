package com.asy.mongo.controller;

import com.asy.mongo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonService personService;

    @GetMapping("/")
    public String insert(){
        personService.insert();
        return "sueccess";
    }
}
