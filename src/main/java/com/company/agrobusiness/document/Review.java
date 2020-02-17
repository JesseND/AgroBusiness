package com.company.agrobusiness.document;


import lombok.Data;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.*;

@Entity
@Data
public class Review implements Serializable {

    @Id
    private UUID id;
    private Item itemReviewed;
    private String comment;
    private Integer rateToFive;
    private Account reviewer;


}
