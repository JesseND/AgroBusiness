package com.company.agrobusiness.document;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
public class OrderedItem implements Serializable {

    @Id
    private UUID orderedItemId;
    private UUID itemId;
    private Integer orderedQuantity;
    private String customerNote;
}
