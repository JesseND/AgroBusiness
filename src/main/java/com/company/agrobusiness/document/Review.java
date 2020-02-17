package com.company.agrobusiness.document;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.UUID;


@Document(value = "review")
@Data
public class Review implements Serializable {

    @Id
    private UUID id;
    private Item itemReviewed;
    private String comment;
    private Integer rateToFive;
    private Account reviewer;


}
