package com.company.agrobusiness.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.*;



@Entity
@Data
public class Account implements Serializable {

    @Id
    private UUID accountId;
    private String username;
    private String password;
    private User accountOwner;

}
