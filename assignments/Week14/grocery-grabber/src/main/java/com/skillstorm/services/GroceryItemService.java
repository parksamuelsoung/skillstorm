package com.skillstorm.services;

import java.util.List;

import com.skillstorm.models.GroceryItem;

public interface GroceryItemService {
    
    List<GroceryItem> findAll();
    GroceryItem findById(long orderId);
    GroceryItem save(GroceryItem groceryItem);
}

