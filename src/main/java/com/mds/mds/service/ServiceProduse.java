package com.mds.mds.service;

import com.mds.mds.entity.Produse;
import com.mds.mds.repository.RepositoryProduse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServiceProduse {
    @Autowired
    private RepositoryProduse repository;

    public Produse saveProdus(Produse produs){

       return repository.save(produs);
    }

    public ServiceProduse() {
    }

    public List<Produse> saveProduse(List<Produse> produse){

        return repository.saveAll(produse);
    }

    public List<Produse> getProduse(){
        return repository.findAll();
    }

    public Produse getProdusById(int id){
        return repository.findById(id).orElse(null);
    }

    public Produse getProdusByName(String nume){
        return repository.findByName(nume);
    }

    // TO DO si ca lista by name


    public String deleteProdus(int id){
        repository.deleteById(id);
        return "Prodis sters || " + id;
    }

    public Produse updateProdus(Produse produs){

        Produse existingProduct = repository.findById(produs.getId()).orElse(null);
        existingProduct.setNume(produs.getNume());
        existingProduct.setPret(produs.getPret());
        return repository.save(existingProduct);
    }





}
