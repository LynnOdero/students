package com.lynn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerServiceTest {
    private final CustomerService customerService = new CustomerService();

    @Test
    void getDetails_ShouldReturn(){
       //Given
        final String name = "Lynn";
        final int age = 32;
        final String phoneNumber = "072828289";

        //Test
        final String response = customerService.getDetails(name,age,phoneNumber);
    }
    @Test
    void getDetails_ShouldReturnErrors(){
        //Given
        final String name = "";
        final int age = 12;
        final String phoneNumber = "0748499498";
        final String expectedResponse = "Name is null or empty";

        //Test
        final String response = customerService.getDetails(name, age, phoneNumber);

        //Verify
        Assertions.assertEquals(expectedResponse, response);
    }
    @Test
    void getDetails_ShouldReturnErrors_WhenCustomerIsUnderAge(){
        //Given
        final String name = "Ken";
        final int age = 12;
        final String phoneNumber = "0748499498";
        final String expectedResponse = "Customer is underage";

        //Test
        final String response = customerService.getDetails(name, age, phoneNumber);

        //Verify
        Assertions.assertEquals(expectedResponse, response);
    }

}
