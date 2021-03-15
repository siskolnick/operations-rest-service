package com.example.codechallenge.controller;

import com.example.codechallenge.entity.*;
import com.example.codechallenge.model.Response;
import com.example.codechallenge.services.OperationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/operations")

public class OperationController {
    @Autowired
    private OperationServices services;
    
    @GetMapping("")
    public ResponseEntity<List<OperationResult>> getResults() {
        return ResponseEntity.ok(services.getOperations());
    }

    @PostMapping(path = "/sum", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Response getASum(@RequestBody OperationSum operation) {
        return this.processRequest(operation);
    }

    @PostMapping(path = "/product", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Response getAProduct(@RequestBody OperationProduct operation) {
        return this.processRequest(operation);
    }

    @PostMapping(path = "/power", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Response getAPower(@RequestBody OperationPower operation) {
        return this.processRequest(operation);
    }

    
    private Response processRequest(@RequestBody OperationResult operation){
        this.services.createOperation(operation );
        operation.setResult();
        return new Response(operation.getResult());
    }
}
