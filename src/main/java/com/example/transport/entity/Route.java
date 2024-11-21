package com.example.transport.entity;

public class Route {

    private String id;
    private String routeNumber;
    private String startPoint;
    private String endPoint;
    private String interval;
    private String scheduleType;
    private String description;

    // Геттери та сеттери
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
