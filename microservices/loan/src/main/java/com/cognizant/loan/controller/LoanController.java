package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class LoanController {

    // Default endpoint at root
    @GetMapping("/")
    public Map<String, Object> defaultLoan() {
        return Map.of(
            "number", "H00987987972342",
            "type", "home",
            "amount", 500000
        );
    }

    // Endpoint for specific loan number
    @GetMapping("/loans/{number}")
    public Map<String, Object> getLoan(@PathVariable String number) {
        return Map.of(
            "number", number,
            "type", "home",
            "amount", 500000
        );
    }
}
