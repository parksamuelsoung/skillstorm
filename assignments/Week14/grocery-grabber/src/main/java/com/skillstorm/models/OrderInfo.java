package com.skillstorm.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_info")
public class OrderInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    @DateTimeFormat
    private LocalDateTime scheduledTime;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<GroceryItem> groceryItems;

    public OrderInfo(long orderId, LocalDateTime scheduledTime, Customer customer, List<GroceryItem> groceryItems) {
        this.orderId = orderId;
        this.scheduledTime = scheduledTime;
        this.customer = customer;
        this.groceryItems = groceryItems;
    }

    public long getOrderId() {
        return orderId;
    }

    public LocalDateTime getScheduledTime() {
        return LocalDateTime.now();
    }

    public void setScheduledTime() {
        this.scheduledTime = LocalDateTime.now();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<GroceryItem> getGroceryItems() {
        return groceryItems;
    }

    public void setGroceryItems(List<GroceryItem> groceryItems) {
        this.groceryItems = groceryItems;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, scheduledTime, customer, groceryItems);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderInfo other = (OrderInfo) obj;
        return this.orderId == other.orderId &&
            this.scheduledTime.equals(other.scheduledTime) &&
            this.customer.equals(other.customer) &&
            this.groceryItems.equals(other.groceryItems);
    }

    @Override
    public String toString() {
        return "OrderInfo [orderId=" + orderId + ", scheduledTime=" + scheduledTime + ", customer=" + customer
                + ", groceryItems=" + groceryItems + "]";
    }

    
    
}
