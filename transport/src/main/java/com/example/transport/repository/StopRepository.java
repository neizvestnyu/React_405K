package com.example.transport.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.transport.entity.Stop;

public interface StopRepository extends ReactiveCrudRepository<Stop, Long> {
}