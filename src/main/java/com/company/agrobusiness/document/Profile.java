package com.company.agrobusiness.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document(value = "profile")
@Data
public class Profile implements Serializable {

    @Id
    private String code;
    private String name;
    private String description;
    private List<privilege> priviledgeList;
}
