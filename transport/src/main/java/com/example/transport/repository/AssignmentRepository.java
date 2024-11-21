package com.example.transport.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.transport.entity.Assignment;

public interface AssignmentRepository extends ReactiveCrudRepository<Assignment, Long> {
}