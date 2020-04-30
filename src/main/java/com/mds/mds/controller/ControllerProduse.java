package com.mds.mds.controller;

import com.mds.mds.entity.Produse;
import com.mds.mds.service.ServiceProduse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerProduse {

    @Autowired
    private ServiceProduse service;
    @PostMapping("/addProdus")
    public Produse addProdus(@RequestBody Produse produs){
        return service.saveProdus(produs);
    }

    @PostMapping("/addProduse")
    public List<Produse> addProduse(@RequestBody List<Produse> produse){
        return service.saveProduse(produse);
    }

    @GetMapping("/produse")
    public List<Produse> findAllProducts(){
        return service.getProduse();
    }

    @GetMapping("/produs/{id}")
    public Produse findProductById(@PathVariable int id){
        return service.getProdusById(id);
    }

//   @GetMapping("/produs/{nume}")
//    public Produse findProductByName(@PathVariable String nume){
//        return service.getProdusByName(nume);
//    }

    @PutMapping("/update")
    public Produse updateProdus(@RequestBody Produse produs){
        return service.updateProdus(produs);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(int id){
        return service.deleteProdus(id);
    }



}
