package by.abelski.boxagent.api;


import by.abelski.boxagent.api.dto.rq.CreatreUseeRq;
import by.abelski.boxagent.api.dto.rq.EraseConfirmRq;
import by.abelski.boxagent.api.dto.rq.EraseRq;
import by.abelski.boxagent.api.dto.rq.UpdateRq;
import by.abelski.boxagent.entities.User;
import by.abelski.boxagent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;


@RestController
@RequestMapping(ApiConstants.API_ROOT + "/users")
public class UserApi {

    @Autowired
    UserService userService;

    @GetMapping
    public User getUser() {
        return userService.getCurrentUser();
    }

    @PreAuthorize("permitAll()")
    @PostMapping()
    public void register(@RequestBody CreatreUseeRq rq){

        final String username = rq.getUsername();
        final String password = rq.getPassword();
                userService.createUser(username,password);

    }

    @PutMapping
    public void update(@RequestBody UpdateRq rq){

    }

    @PermitAll
    @PutMapping("/erasepass")
    public void erasePassword(@RequestBody EraseRq rq){

    }

    @PutMapping("/erasepassconfir,")
    public void erasePasswordConfirm(@RequestBody EraseConfirmRq rq){

    }
}
