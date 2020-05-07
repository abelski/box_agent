package by.abelski.boxagent.api;


import by.abelski.boxagent.api.dto.CalculationRq;
import by.abelski.boxagent.api.dto.CalculationRs;
import by.abelski.boxagent.api.dto.PlaceRq;
import by.abelski.boxagent.api.dto.PlaceRs;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiConstants.API_ROOT + "/serviceproviders")
public class ServiceProvidersApiController {


    @GetMapping
    public List getServiceProviders() {
        return null;
    }

    @PostMapping("/calculate")
    public CalculationRs calculate(@RequestBody CalculationRq rq){
        return new CalculationRs();
    }

    @PostMapping
    public PlaceRs place(@RequestBody PlaceRq rq){
        return new PlaceRs();
    }
}
