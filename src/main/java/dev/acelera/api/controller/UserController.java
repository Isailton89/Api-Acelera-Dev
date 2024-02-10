package dev.acelera.api.controller;

import dev.acelera.api.user.UserRegistrationData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @PostMapping
    public void register(@RequestBody UserRegistrationData data) {
        System.out.println(data);
    }

    @GetMapping
    public String teste(){
        return "teste user";
    }
}
