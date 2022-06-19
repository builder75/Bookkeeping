package com.example.Bookkeeping;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class RepositoryTest {


    @Autowired
    Repository repository;

    @BeforeEach
    void setUp() {
        Action action1 = new Action(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0));
        Action action2 = new Action(BigDecimal.valueOf(6.0), BigDecimal.valueOf(4.0));

        repository.save(action1);
        repository.save(action2);


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sumReceived() {
        assertEquals(repository.sumReceived(), BigDecimal.valueOf(7.0).setScale(2));

        assertNotEquals(repository.sumReceived(), BigDecimal.valueOf(88.0).setScale(2));
    }

    @Test
    void sumSpent() {
        assertEquals(repository.sumSpent(), BigDecimal.valueOf(6.0).setScale(2));

        assertNotEquals(repository.sumSpent(), BigDecimal.valueOf(6.0).setScale(3));


    }
}