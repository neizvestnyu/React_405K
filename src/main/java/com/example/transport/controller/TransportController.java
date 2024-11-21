package com.example.transport.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.transport.entity.Vehicle;

@RestController
public class TransportController {

    @GetMapping("/vehicle")
    public Vehicle getTransportInfo() {
        Vehicle vehicle = new Vehicle();
        vehicle.setId("");
        vehicle.setVehicleType("");
        vehicle.setCapacity("");
        vehicle.setStatus("");
        return vehicle;
    }
}
