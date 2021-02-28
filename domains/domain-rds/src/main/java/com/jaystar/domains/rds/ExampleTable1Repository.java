package com.jaystar.domains.rds;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExampleTable1Repository extends JpaRepository<ExampleTable1, Long> {

    @Query("SELECT p FROM ExampleTable1 p ORDER BY p.id DESC")
    List<ExampleTable1> findAllDesc();
}
