package com.company.agrobusiness.document;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Profile implements Serializable {

    @Id
    private String code;
    private String name;
    private String description;
    private List<Priviledge> priviledgeList;
}
