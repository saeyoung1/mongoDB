package com.asy.mongo.enums;

import lombok.Getter;

@Getter
public enum ColumnName {
    ID("_id"),
    AGE("age"),
    ADDRESS("address"),
    NAME("name");

    private final String name;

    ColumnName(String name) {
        this.name = name;
    }

    public String getName(String name){
        return name;
    }
}
