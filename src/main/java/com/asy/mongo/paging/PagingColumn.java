package com.asy.mongo.paging;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class PagingColumn {
    private int start;
    private int length;
    private int draw;
    private List<Sort> order;
    private List<Column> columns;
    private Search search;
}
