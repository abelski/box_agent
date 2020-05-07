package by.abelski.boxagent.api.dto.rq;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ChangeStatusRq extends AbstractRq{
    String requestId;
    RequestStatus requestStatus;
}
