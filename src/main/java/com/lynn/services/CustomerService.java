package com.lynn.services;

import com.lynn.requests.CustomerInfo;
import com.lynn.responses.CustomerResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CustomerService {



    public String getDetails(String name, int age, String phoneNumber){
        if (name == null || name.isEmpty()){
            return "Name is null or empty";
        } else if (age <=30 )
        {
           return "Customer is underage";

        } else if (phoneNumber == null || phoneNumber.isEmpty()) {
            return "Missing customer contact";
        }

        return String.format("Customer details are %s", name,age, phoneNumber );

    }
    public CustomerResponse createCustomer(@RequestBody CustomerInfo details){
        System.out.printf("Received Request with Name No: %s, Age: %s and PhoneNumber: %s%n",
                details.customerName, details.customerAge, details.customerPhoneNumber);
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.message = "Customer created successfully";
        customerResponse.status = "true";

        return customerResponse;
    }
}
