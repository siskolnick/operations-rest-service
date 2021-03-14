package com.example.codechallenge.entity;
import javax.persistence.*;
@Entity
@DiscriminatorValue("2")
public class OperationProduct extends OperationResult{
    public void setResult(){
       result = Double.valueOf(operator1 * 2);
    }
}