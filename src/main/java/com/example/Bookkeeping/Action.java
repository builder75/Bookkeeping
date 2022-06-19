package com.example.Bookkeeping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Action {
    @Id
    @GeneratedValue
    private int id;
    private BigDecimal received;
    private BigDecimal spent;

    public Action() {
    }

    public Action(BigDecimal received, BigDecimal spent) {
        this.received = received;
        this.spent = spent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getReceived() {
        return received;
    }

    public void setReceived(BigDecimal received) {
        if (received.compareTo(BigDecimal.ZERO) > 0) {
            this.received = received;
        } else {
            System.out.println("illegal");
        }
    }

    public BigDecimal getSpent() {
        return spent;
    }

    public void setSpent(BigDecimal spent) {
        if (spent.compareTo(BigDecimal.ZERO) > 0) {
            this.spent = spent;
        } else {
            System.out.println("illegal");
        }

    }

    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", received=" + received +
                ", spent=" + spent +
                '}';
    }
}
