package com.example.transport.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.transport.entity.Route;


public interface RouteRepository extends ReactiveCrudRepository<Route, String> {
}
