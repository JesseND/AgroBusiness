package com.company.agrobusiness.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.UUID;



@Document(value = "account")
@Data
public class Account implements Serializable {

    @Id
    private UUID accountId;
    private String username;
    private String password;
    private User accountOwner;

}
