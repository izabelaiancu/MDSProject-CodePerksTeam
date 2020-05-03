package com.mds.mds.controller;

import com.mds.mds.entity.Dashboard;
import com.mds.mds.service.ServiceDashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerDashboard {

    @Autowired
    private ServiceDashboard service;
    @PostMapping("/addDashboard")
    public Dashboard addDashboard(@RequestBody Dashboard dashboard){
        return service.saveDashboard(dashboard);
    }

    @PostMapping("/addDashboards")
    public List<Dashboard> addItems(@RequestBody List<Dashboard> dashboards){
        return service.saveDashboards(dashboards);
    }

    @GetMapping("/dashboards")
    public List<Dashboard> findAllItems(){
        return service.getDashboards();
    }

    @GetMapping("/dashboard/{id}")
    public Dashboard findItemById(@PathVariable int id){
        return service.getDashboardById(id);
    }

//   @GetMapping("/produs/{nume}")
//    public Item findProductByName(@PathVariable String nume){
//        return service.getProdusByName(nume);
//    }

    @PutMapping("/updateDashboard")
    public Dashboard updateDashboard(@RequestBody Dashboard dashboard){
        return service.updateDashboard(dashboard);
    }

    @DeleteMapping("/deleteDashboard/{id}")
    public String deleteDashboard(int id){
        return service.deleteDashboard(id);
    }



}
