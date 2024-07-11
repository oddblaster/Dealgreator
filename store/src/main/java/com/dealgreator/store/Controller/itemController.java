package com.dealgreator.store.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dealgreator.store.Entity.Item;
import com.dealgreator.store.Service.ItemService;

@RestController
@RequestMapping(path = "/item") // This means URL's start with /demo (after Application path)
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
    public ResponseEntity<List<Item>> getItems() {
        try {
            return new ResponseEntity<>(ItemService.getItems(), HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @GetMapping("/Items/{id}")
    public ResponseEntity<Item> getItemById(@RequestBody Item Item) {
        try {
            return new ResponseEntity<>(ItemService.getItemById(Item.getId()), HttpStatusCode.valueOf(200));
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
