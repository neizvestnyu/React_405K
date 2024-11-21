package com.example.transport.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class TransportHandler {

    public Mono<ServerResponse> getAssignmentInfo(ServerRequest request) {
        return ServerResponse.ok().bodyValue("Assignment info");
    }

    public Mono<ServerResponse> getRouteInfo(ServerRequest request) {
        return ServerResponse.ok().bodyValue("Route info");
    }

    public Mono<ServerResponse> getRouteStopInfo(ServerRequest request) {
        return ServerResponse.ok().bodyValue("Route Stop info");
    }

    public Mono<ServerResponse> getScheduleInfo(ServerRequest request) {
        return ServerResponse.ok().bodyValue("Schedule info");
    }

    public Mono<ServerResponse> getStopInfo(ServerRequest request) {
        return ServerResponse.ok().bodyValue("Stop info");
    }

    public Mono<ServerResponse> getVehicleInfo(ServerRequest request) {
        return ServerResponse.ok().bodyValue("Vehicle info");
    }
}
