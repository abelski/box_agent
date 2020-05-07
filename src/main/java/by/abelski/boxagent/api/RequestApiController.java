package by.abelski.boxagent.api;


import by.abelski.boxagent.api.dto.Request;
import by.abelski.boxagent.api.dto.rq.ChangeStatusRq;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api("Текущие заявки")
@RestController
@RequestMapping(ApiConstants.API_ROOT + "/requests")
public class RequestApiController {

    @GetMapping
    public List<Request> getActiveRequests() {
        return null;
    }

    @PostMapping
    public void changeStatus(@RequestBody ChangeStatusRq rq){
    }
}
