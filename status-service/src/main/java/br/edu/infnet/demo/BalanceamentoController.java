package br.edu.infnet.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BalanceamentoController {

    private final RestTemplate restTemplate;

    public BalanceamentoController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/test-balance")
    public String testBalance() {
        return this.restTemplate.getForObject("http://status-service/status", String.class);
    }
}
