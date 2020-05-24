package com.mds.mds.controller;

import com.mds.mds.entity.Item;
import com.mds.mds.service.ServiceItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerItem {

    @Autowired
    private ServiceItem service;
    @PostMapping("/addItem")
    public Item addItem(@RequestBody Item item){
        return service.saveItem(item);
    }

    @PostMapping("/addItems")
    public List<Item> addItems(@RequestBody List<Item> items){
        return service.saveItems(items);
    }

    @GetMapping("/items")
    public List<Item> findAllItems(){
        return service.getItems();
    }

    @GetMapping("/item/{id}")
    public Item findItemById(@PathVariable int id){
        return service.getItemById(id);
    }

//   @GetMapping("/produs/{nume}")
//    public Item findProductByName(@PathVariable String nume){
//        return service.getProdusByName(nume);
//    }

    @PutMapping("/updateItem")
    public Item updateItem(@RequestBody Item item){
        return service.updateItem(item);
    }

    @DeleteMapping("/deleteItem/{id}")
    public String deleteItem(@PathVariable int id){
        return service.deleteItem(id);
    }



}
