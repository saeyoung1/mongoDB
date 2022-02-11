package com.asy.mongo.service;

import com.asy.mongo.document.Person;
import com.asy.mongo.enums.ColumnName;
import com.asy.mongo.enums.OperationType;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.core.query.UpdateDefinition;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final MongoTemplate mongoTemplate;

    public String manage(){

        Person person = new Person(950809,"saeyoung","gunpoSanbon",28,"C");

        if(StringUtils.equals(OperationType.INSERT.getName(),person.getType()))
            insert(person);
        else if(StringUtils.equals(OperationType.UPDATE.getName(),person.getType()))
            update(person);
        else if(StringUtils.equals(OperationType.DELETE.getName(),person.getType()))
            delete(person);

        return "finish";

    }

    public List<Person> list(){
        List<Person> test = mongoTemplate.findAll(Person.class);
        return mongoTemplate.findAll(Person.class);
    }

    public void insert(Person person){
        mongoTemplate.insert(person);
    }

    public void update(Person person){

        Person selectPerson = mongoTemplate.findById(person.getId(),Person.class);

        Query query = new Query();
        Update update = new Update();

        query.addCriteria(Criteria.where("_id").is(selectPerson.getId()));

        update.set(ColumnName.ID.getName(),person.getId());
        update.set(ColumnName.NAME.getName(), person.getName());
        update.set(ColumnName.ADDRESS.getName(), person.getAddress());
        update.set(ColumnName.AGE.getName(), person.getAge());

        mongoTemplate.updateMulti(query,update, Person.class);
    }

    public void delete(Person person){
        Person selectPerson = mongoTemplate.findById(person.getId(),Person.class);
        Query query = new Query();

        query.addCriteria(Criteria.where("_id").is(selectPerson.getId()));

        mongoTemplate.findAndRemove(query,Person.class);
    }
}
