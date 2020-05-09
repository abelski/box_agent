package by.abelski.boxagent.api;


import by.abelski.boxagent.api.dto.rq.CalculationRq;
import by.abelski.boxagent.api.dto.rq.PlaceRequestRq;
import by.abelski.boxagent.api.dto.rs.CalculationRs;
import by.abelski.boxagent.api.dto.rs.PlaceRs;
import by.abelski.boxagent.entities.Request;
import by.abelski.boxagent.service.RequestService;
import by.abelski.boxagent.service.errors.ServiceProvidersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiConstants.API_ROOT + "/serviceproviders")
public class ServiceProvidersApi {
    @Autowired
    ServiceProvidersService serviceProvidersService;

    @Autowired
    RequestService requestService;

    @GetMapping
    public List getServiceProviders() {
        return null;
    }

    @PostMapping("/calculate")
    public CalculationRs calculate(@RequestBody CalculationRq rq) {

        final CalculationRs calculationRs = new CalculationRs();
        calculationRs.setCost(serviceProvidersService.calculate());

        return calculationRs;
    }

    @PostMapping
    public PlaceRs place(@RequestBody PlaceRequestRq rq) {

        final Long calculate = serviceProvidersService.calculate();
        final Request request = requestService.place(rq.isBigSizeBox(), calculate,
                rq.getFromAddress(),
                rq.getFromComment(),
                rq.getFromPhone(),
                rq.getToAddress(),
                rq.getToPhone(),
                rq.getToComment(),
                rq.getWhat(),
                rq.getProvider()
        );
        final PlaceRs placeRs = new PlaceRs();
        placeRs.setRequestId(request.getId());
        return placeRs;
    }
}
