package com.example.codechallenge.services;

import com.example.codechallenge.entity.OperationResult;
import com.example.codechallenge.repository.OperationResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OperationServices {

    @Autowired
    private OperationResultRepository operationRepository;

    public void createOperation(OperationResult operation) {
        operationRepository.save(operation);
    }

    public List<OperationResult> getOperations() {
        return operationRepository.findAll();
    }
}