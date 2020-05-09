package by.abelski.boxagent.api;


import by.abelski.boxagent.api.dto.Request;
import by.abelski.boxagent.api.dto.rq.ChangeStatusRq;
import by.abelski.boxagent.service.RequestService;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Api("Текущие заявки")
@RestController
@RequestMapping(ApiConstants.API_ROOT + "/requests")
public class RequestApi {

    Mapper mapper = DozerBeanMapperBuilder.buildDefault();;

    @Autowired
    RequestService requestService;

    @GetMapping
    public List<Request> getActiveRequests() {
        return requestService.getActiveRequests().stream()
                .map(request -> {return mapper.map(request, Request.class);})
                .collect(Collectors.toList());
    }


    @PostMapping
    public void changeStatus(@RequestBody ChangeStatusRq rq){
    }
}
