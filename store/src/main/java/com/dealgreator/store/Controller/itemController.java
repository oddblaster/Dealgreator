package com.dealgreator.store.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dealgreator.store.Entity.Item;
import com.dealgreator.store.Service.ItemService;

@RestController
@RequestMapping("/item")
public class itemController {

    @Autowired
    ItemService ItemService;

    @PostMapping("/addItem")
    public ResponseEntity<Object> addItem(@RequestBody Item Item) {
        try {
            ItemService.addItem(Item);

            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @GetMapping("/getItems")
    @CrossOrigin
    public ResponseEntity<List<Item>> getItems() {
        try {
            return new ResponseEntity<>(ItemService.getItems(), HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @GetMapping("/getItem/{id}")
    @CrossOrigin
    public ResponseEntity<Item> getItemById(@PathVariable("id") Long Id) {
        try {
            return new ResponseEntity<>(ItemService.getItemById(Id), HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @DeleteMapping("/deleteItem")
    public ResponseEntity<Object> deleteItem(@RequestBody Item Item) {
        try {
            ItemService.deleteItem(Item.getId());
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @PostMapping("/updateItem")
    public ResponseEntity<Object> updateItem(@RequestBody Item Item) {
        try {
            ItemService.updateItem(Item);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

}
