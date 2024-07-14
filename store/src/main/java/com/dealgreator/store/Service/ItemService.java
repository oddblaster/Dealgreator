package com.dealgreator.store.Service;

import java.util.List;

import com.dealgreator.store.Entity.Item;

public interface ItemService {
    void addItem(Item Item); // Create

    List<Item> getItems(); // Get

    Item getItemById(Long id); // Search

    void updateItem(Item Item); // Update

    void deleteItem(Long id); // Delete

}