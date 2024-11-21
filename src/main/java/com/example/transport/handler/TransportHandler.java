package com.example.transport.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.transport.entity.Assignment;
import com.example.transport.entity.Route;
import com.example.transport.entity.RouteStop;
import com.example.transport.entity.Schedule;
import com.example.transport.entity.Stop;
import com.example.transport.entity.Vehicle;

import reactor.core.publisher.Mono;

@Component
public class TransportHandler {

    // Обробник запиту для /assignment
    public Mono<ServerResponse> getAssignmentInfo(ServerRequest request) {
        // Створюємо транспортну інформацію
        Assignment assignment = new Assignment();
        assignment.setId("");
        assignment.setRouteId("");
        assignment.setVehicleId("");
        assignment.setStartDate("");
        assignment.setEndDate("");

        // Повертаємо відповідь як Mono
        return ServerResponse.ok().bodyValue(assignment);
    }

    // Обробник запиту для /route
    public Mono<ServerResponse> getRouteInfo(ServerRequest request) {
        // Створюємо транспортну інформацію
        Route route = new Route();
        route.setId("");
        route.setRouteNumber("");
        route.setStartPoint("");
        route.setEndPoint("");
        route.setInterval("");
        route.setScheduleType("");
        route.setDescription("");

        // Повертаємо відповідь як Mono
        return ServerResponse.ok().bodyValue(route);
    }

    // Обробник запиту для /routestop
    public Mono<ServerResponse> getRouteStopInfo(ServerRequest request) {
        // Створюємо транспортну інформацію
        RouteStop routestop = new RouteStop();
        routestop.setId("");
        routestop.setRouteId("");
        routestop.setStopId("");
        routestop.setStopOrder("");
 
        // Повертаємо відповідь як Mono
        return ServerResponse.ok().bodyValue(routestop);
    }

        // Обробник запиту для /schedule
    public Mono<ServerResponse> getScheduleInfo(ServerRequest request) {
        // Створюємо транспортну інформацію
        Schedule schedule = new Schedule();
        schedule.setId("");
        schedule.setRouteId("");
        schedule.setDepartureTime("");
        schedule.setArrivalTime("");
 
        // Повертаємо відповідь як Mono
        return ServerResponse.ok().bodyValue(schedule);
    }
        // Обробник запиту для /stop
    public Mono<ServerResponse> getStopInfo(ServerRequest request) {
        // Створюємо транспортну інформацію
        Stop stop = new Stop();
        stop.setId("");
        stop.setName("");
        stop.setLocation("");
 
        // Повертаємо відповідь як Mono
        return ServerResponse.ok().bodyValue(stop);
    }

        // Обробник запиту для /vehicle
    public Mono<ServerResponse> getVehicleInfo(ServerRequest request) {
        // Створюємо транспортну інформацію
        Vehicle vehicle = new Vehicle();
        vehicle.setId("");
        vehicle.setVehicleType("");
        vehicle.setCapacity("");
        vehicle.setStatus("");
        // Повертаємо відповідь як Mono
        return ServerResponse.ok().bodyValue(vehicle);
    }
}