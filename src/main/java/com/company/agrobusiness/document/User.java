package com.company.agrobusiness.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.UUID;
import java.util.List;

@Document(value = "user")
@Data
public class User {

    @Id
    private UUID userId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String phone;
    private Account account;
    private List<Profile> profiles;


}
