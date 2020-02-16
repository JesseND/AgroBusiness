package com.company.agrobusiness.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;
import java.util.List;

@Entity
@Data
public class User implements Serializable {

    @Id
    private UUID userId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String phone;
    private Account account;
    private List<Profile> profiles;


}
