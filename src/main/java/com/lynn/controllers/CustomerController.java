package com.lynn.controllers;

import com.lynn.requests.CustomerInfo;
import com.lynn.responses.CustomerResponse;
import com.lynn.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("customer/create")
    public CustomerResponse createCustomer(@RequestBody CustomerInfo details){
        return customerService.createCustomer(details);
    }
    @GetMapping("/get_name")
    public String getCustomerName(@RequestParam(name = "name", defaultValue = "Customer A") String name, int age, String phoneNumber){
        return customerService.getDetails(name,age,phoneNumber);
    }

}
