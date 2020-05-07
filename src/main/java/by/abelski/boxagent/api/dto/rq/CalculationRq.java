package by.abelski.boxagent.api.dto.rq;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CalculationRq extends AbstractRq{
    private String what;
    private boolean isBigSizeBox;
    private Long estimatedCost;
    private String paymentType;
    private Long deliveryCost;
    private String provider;

    private String fromAddress;
    private String fromPhone;
    private String fromComment;

    private String toAddress;
    private String toPhone;
    private String toComment;
}
