package com.grid.gathergrid.domain;

import com.grid.gathergrid.domain.enums.TicketType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer price;
    private Integer quantity;
    private TicketType type;

    public Ticket() {
    }

    public Ticket(Integer price, Integer quantity, TicketType type) {
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public TicketType getType() {
        return type;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(price, ticket.price) && Objects.equals(quantity, ticket.quantity) && type == ticket.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, quantity, type);
    }
}
