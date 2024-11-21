package com.example.transport.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.transport.entity.RouteStop;

public interface RouteStopRepository extends ReactiveCrudRepository<RouteStop, Long> {
}