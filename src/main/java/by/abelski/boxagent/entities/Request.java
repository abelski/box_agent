package by.abelski.boxagent.entities;

import lombok.Data;

@Data
public class Request {
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

}
