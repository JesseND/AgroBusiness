package com.company.agrobusiness.document;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(value = "shopping_cart")
@Data
public class ShoppingCart {
}
