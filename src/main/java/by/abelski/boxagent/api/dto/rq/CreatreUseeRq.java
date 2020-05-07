package by.abelski.boxagent.api.dto.rq;

import by.abelski.boxagent.api.dto.CompanyCustomer;
import by.abelski.boxagent.api.dto.IndividualCustomer;
import by.abelski.boxagent.entities.UserType;
import lombok.Data;

@Data
public class CreatreUseeRq {
    UserType userType;

    private String username;
    private String phone;
    private String email;


    CompanyCustomer company;
    IndividualCustomer individualCustomer;
}
