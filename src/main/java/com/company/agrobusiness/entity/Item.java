package com.company.agrobusiness.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;
import java.util.List;

@Data
@Entity
public class Item implements Serializable {

    @Id
    private UUID itemId;
    private String code;
    private String name;
    private LocalDate productionDate;
    private LocalDate expirationDate;
    private Integer quantityInStock;
    private String description;
    private BigDecimal pricePerUnit;
    private String measumentUnit;
    private List<Review> itemReviews;
    private Category itemCategory;

}
