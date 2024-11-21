package com.example.transport.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.transport.entity.Vehicle;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @GetMapping
    public Vehicle getTransportInfo() {
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1L);  // Long значення для ID
        vehicle.setVehicleType("Bus");
        vehicle.setCapacity(40); // Integer значення для місткості
        vehicle.setStatus("Active");
        return vehicle;
    }
}
