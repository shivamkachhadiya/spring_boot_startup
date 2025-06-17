// Package declaration - is file ka address in the project
package com.firstproject.firstproject;

// Spring Boot annotation & class imports
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Marks this class as a REST controller that handles HTTP requests
@RestController
public class myclass {

    // Handles GET requests to the "/sk" endpoint
    @GetMapping("/sk")
    public String myclass(){
        // This string will be returned as the HTTP response
        return "hello world";
    }
}
