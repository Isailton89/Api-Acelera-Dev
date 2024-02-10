package dev.acelera.api.controller;

import dev.acelera.api.client.ClientRegistrationData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {
    @PostMapping
    public void register(@RequestBody ClientRegistrationData data) {
        System.out.println(data);
    }

}
