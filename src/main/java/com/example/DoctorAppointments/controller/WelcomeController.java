
package com.example.DoctorAppointments.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/hello")
    public ResponseEntity<Void> hello() {
        System.out.println("Helloooo");
        return ResponseEntity.ok().build();
    }
}
