package com.example.transport.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.transport.entity.Route;
import com.example.transport.service.RouteService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/routes")
public class RouteController {

    private final RouteService routeService;

    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping
    public Flux<Route> getAllRoutes() {
        return routeService.list();
    }

    @GetMapping("/{id}")
    public Mono<Route> getRouteById(@PathVariable String id) {
        return routeService.getOne(id);
    }

    @PostMapping
    public Mono<Route> createRoute(@RequestBody Route route) {
        return routeService.addOne(route);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteRoute(@PathVariable String id) {
        return routeService.deleteOne(id);
    }
}
