package com.asy.mongo.paging;

import com.asy.mongo.enums.OrderStandard;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Sort {
    private Integer column;
    private OrderStandard dir;
}
