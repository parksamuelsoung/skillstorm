package com.skillstorm.services.impls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.GroceryItem;
import com.skillstorm.repositories.GroceryItemRepository;
import com.skillstorm.services.GroceryItemService;

@Service
public class GroceryItemServiceImpl implements GroceryItemService {

    @Autowired
    private GroceryItemRepository groceryItemRepository;

    public GroceryItemServiceImpl(GroceryItemRepository groceryItemRepository) {
        this.groceryItemRepository = groceryItemRepository;
    }

    @Override
    public List<GroceryItem> findAll() {
        return groceryItemRepository.findAll();
    }

    @Override
    public GroceryItem findById(long groceryItemId) {
        Optional<GroceryItem> optionalGroceryItem = groceryItemRepository.findById(groceryItemId);
        if (optionalGroceryItem.isPresent()) {
            return optionalGroceryItem.get();
        } else {
            throw new IllegalArgumentException("Id not found.");
        }
    }

    @Override
    public GroceryItem save(GroceryItem groceryItem) {
        if (groceryItem != null) {
            return groceryItemRepository.save(groceryItem);
        } else {
            throw new IllegalArgumentException("GroceryItem is null.");
        }
    }
    

}
