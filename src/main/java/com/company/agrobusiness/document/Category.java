package com.company.agrobusiness.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.UUID;

@Data
@Document(value = "category")
public class Category implements Serializable {

    @Id
    private UUID categoryId;
    private String name;
    private String code;
    private String description;


}
