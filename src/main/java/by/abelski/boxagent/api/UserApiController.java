package by.abelski.boxagent.api;


import by.abelski.boxagent.api.dto.CreatreUseRq;
import by.abelski.boxagent.api.dto.UpdateRq;
import by.abelski.boxagent.entities.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiConstants.API_ROOT + "/users")
public class UserApiController {


    @GetMapping
    public User getUser() {
        return null;
    }

    @PostMapping()
    public void register(@RequestBody CreatreUseRq rq){

    }

    @PutMapping
    public void update(@RequestBody UpdateRq rq){

    }
}
