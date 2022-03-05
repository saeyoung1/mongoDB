package com.asy.mongo.paging;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public class Search {

    private String value;
    private String regexp;
}
