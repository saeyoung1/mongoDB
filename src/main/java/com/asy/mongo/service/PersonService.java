package com.asy.mongo.service;

import com.asy.mongo.document.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final MongoTemplate mongoTemplate;

    public void insert(){
        Person person = new Person(950809,"saeyoung","gunpo",28);
        mongoTemplate.insert(person);
    }

}
