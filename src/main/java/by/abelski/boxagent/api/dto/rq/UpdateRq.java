package by.abelski.boxagent.api.dto.rq;

import by.abelski.boxagent.api.dto.CompanyCustomer;
import by.abelski.boxagent.entities.IndividualCustomer;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class UpdateRq extends AbstractRq{
    private String phone;
    private String email;


    CompanyCustomer company;
    IndividualCustomer individualCustomer;
}
