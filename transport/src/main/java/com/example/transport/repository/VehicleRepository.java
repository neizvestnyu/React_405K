package com.example.transport.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.transport.entity.Vehicle;

public interface VehicleRepository extends ReactiveCrudRepository<Vehicle, Long> {
}