package com.example.codechallenge.repository;

import com.example.codechallenge.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationResultRepository extends JpaRepository<OperationResult,Integer> {
}