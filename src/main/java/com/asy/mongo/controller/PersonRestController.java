package com.asy.mongo.controller;

import com.asy.mongo.document.Person;
import com.asy.mongo.paging.Page;
import com.asy.mongo.paging.PagingColumn;
import com.asy.mongo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonRestController {

    private final PersonService personService;

    @PostMapping("/manage")
    public String insert(@RequestBody  Person person){
        personService.manage(person);
        return "sueccess";
    }

    @PostMapping("/list")
    public Page<Person> list(@RequestBody PagingColumn pagingColumn){
        return personService.list(pagingColumn);
    }
}
