package com.mds.mds.service;

import com.mds.mds.entity.Item;
import com.mds.mds.repository.RepositoryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceItem {
    @Autowired
    private RepositoryItem repository;

    public Item saveItem(Item item){

       return repository.save(item);
    }

    public ServiceItem() {
    }

    public List<Item> saveItems(List<Item> items){

        return repository.saveAll(items);
    }

    public List<Item> getItems(){
        return repository.findAll();
    }

    public Item getItemById(int id){
        return repository.findById(id).orElse(null);
    }

//   public Item getProdusByName(String nume){
//        return repository.findByName(nume);
//   }
//

    // TO DO si ca lista by name


    public String deleteItem(int id){
        repository.deleteById(id);
        return "Deleted item || " + id;
    }

    public Item updateItem(Item item){

        Item existingItem = repository.findById(item.getId()).orElse(null);
        existingItem.setName(item.getName());
        existingItem.setPrice(item.getPrice());
        existingItem.setDescription(item.getDescription());
        //existingItem.setPictures(item.getPictures());
        //existingItem.setTags(item.getTags());
        return repository.save(existingItem);
    }





}
