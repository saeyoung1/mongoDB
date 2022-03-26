package com.asy.mongo.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Document("person_data")
public class Person {
    @Id
    private long id;
    private String name;
    private String address;
    private int age;
    private String type;
}
