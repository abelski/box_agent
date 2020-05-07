package by.abelski.boxagent.api;


import by.abelski.boxagent.api.dto.ChangeStatusRq;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api("Текущие заявки")
@RestController
@RequestMapping(ApiConstants.API_ROOT + "/requests")
public class RequestApiController {

    @GetMapping
    public List getActiveRequests() {
        return null;
    }

    @PostMapping
    public void changeStatus(@RequestBody ChangeStatusRq rq){
    }
}