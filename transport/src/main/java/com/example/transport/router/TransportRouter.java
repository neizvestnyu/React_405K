package com.example.transport.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.transport.handler.TransportHandler;

@Configuration
public class TransportRouter {

    private final TransportHandler transportHandler;

    public TransportRouter(TransportHandler transportHandler) {
        this.transportHandler = transportHandler;
    }

    @Bean
    public RouterFunction<ServerResponse> transportRoutes() {
        return route()
                .GET("/assignment", transportHandler::getAssignmentInfo)
                .GET("/route", transportHandler::getRouteInfo)
                .GET("/routestop", transportHandler::getRouteStopInfo)
                .GET("/schedule", transportHandler::getScheduleInfo)
                .GET("/stop", transportHandler::getStopInfo)
                .GET("/vehicle", transportHandler::getVehicleInfo)
                .build();
    }
}
