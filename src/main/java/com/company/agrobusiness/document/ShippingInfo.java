package com.company.agrobusiness.document;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;

@Document(value = "shipping_info")
@Data
public class ShippingInfo implements Serializable {
}
