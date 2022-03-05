package com.asy.mongo.paging;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public class Column {

    private String data;
    private String name;
    private Boolean searchable;
    private Boolean orderable;
    private Search filter;

    public Column(String data) {
        this.data = data;
    }

}
