package com.company.agrobusiness.document;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Data
@Document(value = "address")
public class Address implements Serializable {

}
