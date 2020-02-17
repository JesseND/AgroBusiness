package com.company.agrobusiness.document;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(value = "functionality")

public class Functionality  {

    @Id
    private String code;
    private String name;
    private String descrioption;
    private List<Action> actionList;
}
