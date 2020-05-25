package com.mds.mds.controller;

import com.mds.mds.entity.DashboardPost;
import com.mds.mds.service.ServiceDashboardPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerDashboardPost {

    @Autowired
    private ServiceDashboardPost service;
    @PostMapping("/addDashboardPost")
    public DashboardPost addDashboardPost(@RequestBody DashboardPost dashboard){
        return service.saveDashboardPost(dashboard);
    }

    @PostMapping("/addDashboardPosts")
    public List<DashboardPost> addIDashboardPost(@RequestBody List<DashboardPost> dashboards){
        return service.saveDashboardPosts(dashboards);
    }

    @GetMapping("/dashboardPosts")
    public List<DashboardPost> findAllDashboardPosts(){
        return service.getDashboardPosts();
    }

    @GetMapping("/dashboardPost/{id}")
    public DashboardPost findDashboardPostById(@PathVariable int id){
        return service.getDashboardPostById(id);
    }

//   @GetMapping("/produs/{nume}")
//    public Item findProductByName(@PathVariable String nume){
//        return service.getProdusByName(nume);
//    }

    @PutMapping("/updateDashboardPost")
    public DashboardPost updateDashboardPost(@RequestBody DashboardPost dashboard){
        return service.updateDashboardPost(dashboard);
    }

    @DeleteMapping("/deleteDashboardPost/{id}")
    public String deleteDashboardPost(@PathVariable int id){
        return service.deleteDashboard(id);
    }



}
