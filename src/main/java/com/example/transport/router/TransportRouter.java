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
                .GET("/assignment", transportHandler::getAssignmentInfo)  // Route for assignment
                .GET("/route", transportHandler::getRouteInfo)            // Route for route info
                .GET("/routestop", transportHandler::getRouteStopInfo)    // Route for route-stop info
                .GET("/schedule", transportHandler::getScheduleInfo)      // Route for schedule info
                .GET("/stop", transportHandler::getStopInfo)              // Route for stop info
                .GET("/vehicle", transportHandler::getVehicleInfo)        // Route for vehicle info
                .build();
    }
}
