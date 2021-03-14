package com.example.codechallenge.entity;
import javax.persistence.*;
@Entity
@DiscriminatorValue("3")
public class OperationPower extends OperationResult{
    public void setResult(){
       result = Math.pow(operator1, 2);
    }

   
}