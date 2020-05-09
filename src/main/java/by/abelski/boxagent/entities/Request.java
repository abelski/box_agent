package by.abelski.boxagent.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Request {

    @Id
    private String id;
    private String what;
    private boolean isBigSizeBox;
    private Long estimatedCost;
    private PaymentType paymentType;
    private Long deliveryCost;

    @DBRef
    private ServiceProviders provider;

    private String fromAddress;
    private String fromPhone;
    private String fromComment;

    private String toAddress;
    private String toPhone;
    private String toComment;

    private Date cretionDate;
    private Date closeDate;

    @DBRef
    private User createdBy;

    private Status status;
}
