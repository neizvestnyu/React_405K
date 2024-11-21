package com.example.transport.service;

import org.springframework.stereotype.Service;

import com.example.transport.entity.Route;
import com.example.transport.repository.RouteRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class RouteService {

    private final RouteRepository routeRepository;

    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public Flux<Route> list() {
        return routeRepository.findAll();
    }
    
    public Mono<Route> getOne(String id) {
        return routeRepository.findById(id);
    }
    
    public Mono<Route> addOne(Route route) {
        return routeRepository.save(route);
    }
    
    public Mono<Void> deleteOne(String id) {
        return routeRepository.deleteById(id);
    }
}
