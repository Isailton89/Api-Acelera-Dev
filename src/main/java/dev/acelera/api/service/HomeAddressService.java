package dev.acelera.api.service;

import dev.acelera.api.user.HomeAddress;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeAddressService {
    public HomeAddress addressCep(int cep) {
        String urlViaCep = "https://viacep.com.br/ws/" + cep + "/json/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(urlViaCep, HomeAddress.class);
    }
}
