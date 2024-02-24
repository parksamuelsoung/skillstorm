package com.skillstorm.models;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;

    private String name;

    private String address;

    @OneToMany(mappedBy = "customer")
    private List<OrderInfo> orders;

    public Customer() {
    }

    public Customer(long customerId, String name, String address, List<OrderInfo> orders) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.orders = orders;
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<OrderInfo> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderInfo> orders) {
        this.orders = orders;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, name, address, orders);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        return this.customerId == other.getCustomerId() &&
            this.name.equals(other.getName()) &&
            this.address.equals(other.getAddress()) &&
            this.orders.equals(other.getOrders());
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + ", orderInfoList="
                + orders + "]";
    }
    
    

}
