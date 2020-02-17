package com.company.agrobusiness.document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@Document(collection = "agro-business")
public class Item  {

    @Id
    @Field("_id")
    private Long id;
//    private UUID itemId;
    private String code;
    private String name;
    private LocalDate productionDate;
    private LocalDate expirationDate;
    private Integer quantityInStock;
    private String description;
    private BigDecimal pricePerUnit;
    private String measurementUnit ;
    private List<Review> itemReviews;
    private List<Category> itemCategories;

}
