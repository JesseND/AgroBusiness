package com.company.agrobusiness.document;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Priviledge implements Serializable {

    @Id
    private String code;
    private List<Functionality> functionalities;

}
