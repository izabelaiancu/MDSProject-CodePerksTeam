package com.mds.mds.controller;

import com.mds.mds.entity.Profile;
import com.mds.mds.service.ServiceProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerProfile {

    @Autowired
    private ServiceProfile service;
    @PostMapping("/addProfile")
    public Profile addProfile(@RequestBody Profile profile){
        return service.saveProfile(profile);
    }

    @PostMapping("/addProfile")
    public List<Profile> addProfiles(@RequestBody List<Profile> posts){
        return service.saveProfiles(posts);
    }

    @GetMapping("/profiles")
    public List<Profile> findAllProfiles(){
        return service.getProfiles();
    }

    @GetMapping("/profile/{id}")
    public Profile findProfileById(@PathVariable int id){
        return service.getProfileById(id);
    }

//   @GetMapping("/produs/{nume}")
//    public Item findProductByName(@PathVariable String nume){
//        return service.getProdusByName(nume);
//    }

    @PutMapping("/updateProfile")
    public Profile updateProfile(@RequestBody Profile post){
        return service.updateProfile(post);
    }

    @DeleteMapping("/deleteProfile/{id}")
    public String deleteProfile(int id){
        return service.deleteProfile(id);
    }



}
