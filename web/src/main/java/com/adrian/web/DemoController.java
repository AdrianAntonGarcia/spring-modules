package com.adrian.web;
import com.adrian.accessingmongodb.Customer;
import com.adrian.accessingmongodb.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {

    @Autowired
    private CustomerRepository repo;

    @GetMapping("/")
    public String home() {
        //this.repo.save(new Customer("Adrian", "anton"));
        return "Hola";
    }
}
