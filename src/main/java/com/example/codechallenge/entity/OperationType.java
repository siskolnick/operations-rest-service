package com.example.codechallenge.entity;

import javax.persistence.*;

@Entity
public class OperationType {

    @Id
    private int id;

    @Column
    private String name;
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}