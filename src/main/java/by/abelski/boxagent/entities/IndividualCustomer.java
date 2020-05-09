package by.abelski.boxagent.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class IndividualCustomer extends Customer {

    private String firstName;
    private String midleName;
    private String lastName;
}
