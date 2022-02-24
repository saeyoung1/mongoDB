package com.asy.mongo.paging;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public class Filter {

    private String value;
    private String regexp;
}
