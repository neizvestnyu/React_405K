package com.example.transport.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.transport.entity.Schedule;

public interface ScheduleRepository extends ReactiveCrudRepository<Schedule, Long> {
}