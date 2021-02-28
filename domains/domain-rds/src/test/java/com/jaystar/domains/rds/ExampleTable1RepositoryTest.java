package com.jaystar.domains.rds;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleTable1RepositoryTest {

    @Autowired
    public ExampleTable1Repository exampleTable1Repository;

    @After
    public void cleanup() {
        exampleTable1Repository.deleteAll();}

    @Test
    public void 개발예제저장_불러오기() {
        //given
        String productName = "Hanchang Paper";
        int quantityPerUnit = 10;
        double unitPrice = 14.51;
        int unitsInStock = 5;
        boolean discontinued = false;

        exampleTable1Repository.save(ExampleTable1.builder()
                .productName(productName)
                .quantityPerUnit(quantityPerUnit)
                .unitPrice(unitPrice)
                .unitsInStock(unitsInStock)
                .discontinued(discontinued)
                .build());

        //when
        List<ExampleTable1> devExampleList = exampleTable1Repository.findAll();

        //then
        ExampleTable1 devExample = devExampleList.get(0);
        assertThat(devExample.getProductName()).isEqualTo(productName);
        assertThat(devExample.getQuantityPerUnit()).isEqualTo(quantityPerUnit);
        assertThat(devExample.getUnitPrice()).isEqualTo(unitPrice);
        assertThat(devExample.getUnitsInStock()).isEqualTo(unitsInStock);
    }
}
