package com.company.agrobusiness.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.UUID;

@Data
@Document(value = "ordered_item")
public class OrderedItem  {

    @Id
    private UUID orderedItemId;
    private UUID itemId;
    private Integer orderedQuantity;
    private String customerNote;
}
