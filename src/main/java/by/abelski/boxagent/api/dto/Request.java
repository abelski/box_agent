package by.abelski.boxagent.api.dto;

import by.abelski.boxagent.entities.PaymentType;
import by.abelski.boxagent.entities.ServiceProviders;
import lombok.Data;

import java.util.Date;
@Data
public class Request {
    private String id;

    private String what;
    private boolean isBigSizeBox;
    private Long estimatedCost;
    private PaymentType paymentType;
    private Long deliveryCost;
    private ServiceProviders provider;

    private String fromAddress;
    private String fromPhone;
    private String fromComment;

    private String toAddress;
    private String toPhone;
    private String toComment;

    private Date cretionDate;
    private Date closeDate;
}
