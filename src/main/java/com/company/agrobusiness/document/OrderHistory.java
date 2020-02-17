package com.company.agrobusiness.document;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(value = "order_history")
public class OrderHistory{
}
