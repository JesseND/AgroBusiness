package com.company.agrobusiness.document;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.*;

@Data
@Entity
public class Category implements Serializable {

    @Id
    private UUID categoryId;
    private String name;
    private String code;
    private String description;


}
