package com.company.agrobusiness.document;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Action implements Serializable {

    @Id
    private String code;
    private String name;
    private String description;

}
