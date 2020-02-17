package com.company.agrobusiness.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.math.BigDecimal;
import java.util.UUID;
import java.util.List;

@Data
@Document(value = "oder")
public class Order {

    @Id
    private UUID orderId;
    private boolean isPlaced;
    private BigDecimal totalPrice;
    private List<OrderedItem> orderedItemsList;
    private Account orderFromAccount;

}
