package com.mds.mds.service;

import com.mds.mds.entity.User;
import com.mds.mds.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUser {
    @Autowired
    private RepositoryUser repository;

    public User saveUser(User user){

        return repository.save(user);
    }

    public ServiceUser() {
    }

    public List<User> saveUsers(List<User> users){

        return repository.saveAll(users);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUserById(int id){
        return repository.findById(id).orElse(null);
    }

//   public Item getProdusByName(String nume){
//        return repository.findByName(nume);
//   }
//

    // TO DO si ca lista by name


    public String deleteUser(int id){
        repository.deleteById(id);
        return "Deleted user || " + id;
    }

    public User updateUser(User produs){

        User existingProduct = repository.findById(produs.getId()).orElse(null);
        existingProduct.setLastName(produs.getLastName());
        existingProduct.setFirstName(produs.getFirstName());
        existingProduct.setEmail(produs.getEmail());
        existingProduct.setUsername(produs.getUsername());
        existingProduct.setPassword(produs.getPassword());
        existingProduct.setPhoneNumber(produs.getPhoneNumber());
        return repository.save(existingProduct);
    }





}
