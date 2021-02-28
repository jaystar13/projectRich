package com.jaystar.domains.rds;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class ExampleTable1 extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String productName;

    @Column
    private int quantityPerUnit;

    @Column
    private double unitPrice;

    @Column
    private int unitsInStock;

    @Column(length = 1)
    private boolean discontinued;

    @Builder
    public ExampleTable1(String productName, int quantityPerUnit, double unitPrice, int unitsInStock, boolean discontinued) {
        this.productName = productName;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.discontinued = discontinued;
    }

    public void update(String productName, int quantityPerUnit, double unitPrice, int unitsInStock, boolean discontinued) {
        this.productName = productName;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.discontinued = discontinued;
    }
}
