package com.mds.mds.controller;

import com.mds.mds.entity.MainFilter;
import com.mds.mds.service.ServiceMainFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerMainFilter {

    @Autowired
    private ServiceMainFilter service;
    @PostMapping("/addMainFilter")
    public MainFilter addMainFilter(@RequestBody MainFilter mainFilter){
        return service.saveMainFilter(mainFilter);
    }

    @PostMapping("/addMainFilters")
    public List<MainFilter> addMainFilters(@RequestBody List<MainFilter> mainFilters){
        return service.saveMainFilters(mainFilters);
    }

    @GetMapping("/mainFilters")
    public List<MainFilter> findAllMainFilters(){
        return service.getMainFilters();
    }

    @GetMapping("/mainFilter/{id}")
    public MainFilter findPostById(@PathVariable int id){
        return service.getMainFilterById(id);
    }

//   @GetMapping("/produs/{nume}")
//    public Item findProductByName(@PathVariable String nume){
//        return service.getProdusByName(nume);
//    }

    @PutMapping("/updateMainFilter")
    public MainFilter updateMainFilter(@RequestBody MainFilter post){
        return service.updateMainFilter(post);
    }

    @DeleteMapping("/deleteMainFilter/{id}")
    public String deleteMainFilter(int id){
        return service.deleteMainFilter(id);
    }



}
