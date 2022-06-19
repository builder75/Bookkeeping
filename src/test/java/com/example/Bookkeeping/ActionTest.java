package com.example.Bookkeeping;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ActionTest {


    private Action action1;
    private Action action2;

    @BeforeEach
    void setUp() {
        action1 = new Action(BigDecimal.valueOf(10.0), BigDecimal.valueOf(5.0));
        action2 = new Action(BigDecimal.valueOf(6.0), BigDecimal.valueOf(4.0));

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getId() {

    }

    @Test
    void setId() {
    }

    @Test
    void getReceived() {
        assertEquals(action1.getReceived(), BigDecimal.valueOf(10.0));
        assertEquals(action2.getReceived(), BigDecimal.valueOf(6.0));

        assertNotEquals(action1.getReceived(), BigDecimal.valueOf(12.0));
        assertNotEquals(action2.getReceived(), BigDecimal.valueOf(22.0));


    }

    @Test
    void setReceived() {
        action1.setReceived(BigDecimal.valueOf(4.0));
        action2.setReceived(BigDecimal.valueOf(8.0));

        assertEquals(action1.getReceived(), BigDecimal.valueOf(4.0));
        assertEquals(action2.getReceived(), BigDecimal.valueOf(8.0));

        assertNotEquals(action1.getReceived(), BigDecimal.valueOf(44.0));
        assertNotEquals(action2.getReceived(), BigDecimal.valueOf(188.0));
    }

    @Test
    void getSpent() {
        assertEquals(action1.getSpent(), BigDecimal.valueOf(5.0));
        assertEquals(action2.getSpent(), BigDecimal.valueOf(4.0));

        assertNotEquals(action1.getSpent(), BigDecimal.valueOf(55.0));
        assertNotEquals(action2.getSpent(), BigDecimal.valueOf(44.0));
    }

    @Test
    void setSpent() {
        action1.setSpent(BigDecimal.valueOf(9.0));
        action2.setSpent(BigDecimal.valueOf(13.0));

        assertEquals(action1.getSpent(), BigDecimal.valueOf(9.0));
        assertEquals(action2.getSpent(), BigDecimal.valueOf(13.0));

        assertNotEquals(action1.getSpent(), BigDecimal.valueOf(19.0));
        assertNotEquals(action2.getSpent(), BigDecimal.valueOf(18.0));
    }

    @Test
    void testToString() {
        assertEquals(action1.toString(), "Action{id=0, received=10.0, spent=5.0}");
        assertEquals(action2.toString(), "Action{id=0, received=6.0, spent=4.0}");

        assertNotEquals(action1.toString(), "Action{id=3, received=10.0, spent=5.0}");
        assertNotEquals(action2.toString(), "Action{id=0, received=7.0, spent=4.0}");

    }
}