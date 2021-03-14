package com.example.codechallenge.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    discriminatorType = DiscriminatorType.INTEGER,
    name = "type_id",
    columnDefinition = "TINYINT(1) UNSIGNED NOT NULL"
)

public abstract class OperationResult {
    public OperationResult(OperationResult opr){}
    public OperationResult(){}
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Transient
    protected Double result;

    @Column(name="type_id", insertable = false, updatable = false)
    protected int typeId;

    @Column
    protected Integer operator1;

    @Column
    protected Integer operator2 = null;

    public int getId() {
        return id;
    }

    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        if( operator2 == null)
            return 0;
        return operator2;
    }
   
    public int getTypeId() {
        return typeId;
    }
    public void setOperator2(Integer op2) {
        if( op2 == null){
            this.operator2 = 0;
        }else{
            this.operator2 = op2;
        }
    }

    public void setOperator1(int op1) {
        this.operator1 = op1;
    }

    public Double getResult(){
        return result;
    }

    @PostLoad
    private void onLoad() {
        this.setResult();
    }

    public abstract void setResult();
}
