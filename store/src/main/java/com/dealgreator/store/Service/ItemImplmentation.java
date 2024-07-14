package com.dealgreator.store.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealgreator.store.Entity.Item;
import com.dealgreator.store.Repository.ItemRepo;

@Service
public class ItemImplmentation implements ItemService {

    @Autowired
    ItemRepo ItemRepo;

    @Override
    public void addItem(Item Item) {
        ItemRepo.save(Item);
    }

    @Override
    public List<Item> getItems() {
        return ItemRepo.findAll();
    }

    @Override
    public Item getItemById(Long id) {
        return ItemRepo.findById(id).get();
    }

    @Override
    public void updateItem(Item Item) {
        ItemRepo.save(Item);
    }

    @Override
    public void deleteItem(Long id) {
        ItemRepo.deleteById(id);
    }
}
