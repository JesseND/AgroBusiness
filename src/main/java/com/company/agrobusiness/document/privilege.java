package com.company.agrobusiness.document;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "privilege")
@Data
public class privilege {

    @Id
    private String code;
    private List<Functionality> functionalities;

}
