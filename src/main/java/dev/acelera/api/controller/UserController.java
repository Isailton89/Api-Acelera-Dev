package dev.acelera.api.controller;

import dev.acelera.api.user.UserRegistrationData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class UserController {
    @PostMapping
    public void register(@RequestBody UserRegistrationData data) {
        System.out.println(data);
    }

}
