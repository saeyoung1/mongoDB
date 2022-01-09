package com.asy.mongo.enums;

import lombok.Getter;

@Getter
public enum OperationType {
    INSERT("C"),
    UPDATE("U"),
    DELETE("D");

    private final String name;

    OperationType(String name) {
        this.name = name;
    }

     public String getName(String name){
        return name;
    }
}
