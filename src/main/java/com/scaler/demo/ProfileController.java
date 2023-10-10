package com.scaler.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController{
    // TODO Auto-generated constructor stub
    @GetMapping("/profile")
    public ResponseEntity<?> getProfile() {
        Profile user = new Profile("John Doe", 25, "123 Main St", "johndoe@google.com", "123-456-7890", "password");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
