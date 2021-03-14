package com.example.codechallenge.entity;
import javax.persistence.*;
@Entity
@DiscriminatorValue("1")
public class OperationSum extends OperationResult{
    public void setResult(){
       result = Double.valueOf(operator1 + operator2);
    }
    public OperationSum(){}
    public OperationSum(OperationResult opr) {
        super(opr);
    }
}
