package com.asy.mongo.controller;

import com.asy.mongo.document.Person;
import com.asy.mongo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonRestController {

    private final PersonService personService;

    @GetMapping("/manage")
    public String insert(){
        personService.manage();
        return "sueccess";
    }

    @GetMapping("/list")
    public List<Person> list(){
        return personService.list();
    }
}
