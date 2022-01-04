package com.asy.mongo.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Getter
@Document("person_info")
public class Person {
    @Id
    private long registerNumber;
    private String name;
    private String address;
    private int age;
}
