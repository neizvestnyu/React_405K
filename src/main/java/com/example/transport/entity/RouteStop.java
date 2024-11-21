package com.example.transport.entity;

public class RouteStop {

    private String id;
    private String routeId;
    private String stopId;
    private String stopOrder;

    // Геттери та сеттери
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public String getStopOrder() {
        return stopOrder;
    }

    public void setStopOrder(String stopOrder) {
        this.stopOrder = stopOrder;
    }
}
