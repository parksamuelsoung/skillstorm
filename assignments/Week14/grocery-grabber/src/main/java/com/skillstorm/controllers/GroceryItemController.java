package com.skillstorm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.GroceryItem;
import com.skillstorm.services.GroceryItemService;

@RestController
@RequestMapping("/items")
public class GroceryItemController {
    
    @Autowired
    private GroceryItemService groceryItemService;

    public GroceryItemController(GroceryItemService groceryItemService) {
        this.groceryItemService = groceryItemService;
    }

    @GetMapping
    public List<GroceryItem> findAll() {
        return groceryItemService.findAll();
    }
    
    @GetMapping("/{id}")
    public GroceryItem findById(@PathVariable long id) {
        return groceryItemService.findById(id);
    }
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public GroceryItem save(@RequestBody GroceryItem groceryItem) {
        return groceryItemService.save(groceryItem);
    }

}