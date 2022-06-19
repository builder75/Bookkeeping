package com.example.Bookkeeping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigDecimal;

@RepositoryRestResource(collectionResourceRel = "action", path = "action")
public interface Repository extends JpaRepository<Action, Integer> {
    @Query(value = "SELECT SUM(received) FROM Action", nativeQuery = true)
    BigDecimal sumReceived();

    @Query(value = "SELECT SUM(spent) FROM Action", nativeQuery = true)
    BigDecimal sumSpent();
}
