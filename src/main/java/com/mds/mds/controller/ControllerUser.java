package com.mds.mds.controller;

import com.mds.mds.entity.User;
import com.mds.mds.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ControllerUser {

    @Autowired
    private ServiceUser service;
    @PostMapping("/addUser")
    public User addProdus(@RequestBody User user){
        return service.saveUser(user);
    }

    @PostMapping("/addUsers")
    public List<User> addProduse(@RequestBody List<User> users){
        return service.saveUsers(users);
    }

    @GetMapping("/users")
    public List<User> findAllProducts(){
        return service.getUsers();
    }

    @GetMapping("/user/{id}")
    public User findProductById(@PathVariable int id){
        return service.getUserById(id);
    }

//   @GetMapping("/produs/{nume}")
//    public Item findProductByName(@PathVariable String nume){
//        return service.getProdusByName(nume);
//    }

    @PutMapping("/updateUser")
    public User updateProdus(@RequestBody User user){
        return service.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }



}
