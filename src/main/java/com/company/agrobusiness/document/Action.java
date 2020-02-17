package com.company.agrobusiness.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(value = "action")
public class Action implements Serializable {

    @Id
    private String code;
    private String name;
    private String description;

}
