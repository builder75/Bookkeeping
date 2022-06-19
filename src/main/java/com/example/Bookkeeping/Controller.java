package com.example.Bookkeeping;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping(path = "action/")
public class Controller {
    @Autowired
    Repository repository;

    @GetMapping("/sumReceived")
    public BigDecimal sumReceived() {
        return repository.sumReceived();
    }

    @GetMapping("/sumSpent")
    public BigDecimal sumSpent() {
        return repository.sumSpent();
    }

    @GetMapping("/total")
    public BigDecimal total() {
        return repository.sumReceived().subtract(repository.sumSpent());
    }
}
