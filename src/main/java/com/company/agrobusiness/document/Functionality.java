package com.company.agrobusiness.document;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Data
public class Functionality implements Serializable {

    @Id
    private String code;
    private String name;
    private String descrioption;
    private List<Action> actionList;
}
