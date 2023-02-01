package com.lynn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class StudentServiceTest {

    @InjectMocks
    private StudentService studentService;

    @Test
    void getName_shouldReturnName() {
        // Given
        final String name = "David";
        final String expectedResponse = "My name is David";

        // Test
        final String response = studentService.getName(name);

        // Verify
        Assertions.assertEquals(expectedResponse, response);
    }

    @Test
    void getName_shouldReturnFail_whenNameIsEmpty() {
        // Given
        final String name = "";
        final String expectedResponse = "Name is null or empty";

        // Test
        final String response = studentService.getName(name);

        // Verify
        Assertions.assertEquals(expectedResponse, response);
    }

    @Test
    void getName_shouldReturnFail_whenNameIsNull(){
        final String name = null;
        final String expectedResponse = "Name is null or empty";

        //Test
        final String response = studentService.getName(name);

        //Verify
        Assertions.assertEquals(expectedResponse,response);
    }


}
