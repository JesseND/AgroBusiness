package com.company.agrobusiness.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;
import java.util.List;

@Entity
@Data
public class Order implements Serializable{

    @Id
    private UUID orderId;
    private boolean isPlaced;
    private BigDecimal totalPrice;
    private List<OrderedItem> orderedItemsList;
    private Account orderFromAccount;

}
