package com.skillstorm.models;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class GroceryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long groceryId;

    private String description;

    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private OrderInfo order;

    public GroceryItem(long groceryId, String description, int quantity, OrderInfo order) {
        this.groceryId = groceryId;
        this.description = description;
        this.quantity = quantity;
        this.order = order;
    }

    public long getGroceryId() {
        return groceryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderInfo getOrder() {
        return order;
    }

    public void setOrder(OrderInfo order) {
        this.order = order;
    }

    @Override
    public int hashCode() {
        return Objects.hash(groceryId, description, quantity, order);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GroceryItem other = (GroceryItem) obj;
        return this.groceryId == other.groceryId &&
            this.description.equals(other.description) &&
            this.quantity == other.quantity &&
            this.order == other.order;
    }

    @Override
    public String toString() {
        return "GroceryItem [groceryId=" + groceryId + ", description=" + description + ", quantity=" + quantity
                + ", order=" + order + "]";
    }

    
    
    
}
