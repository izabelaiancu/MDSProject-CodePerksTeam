package com.mds.mds.controller;

import com.mds.mds.entity.Bucket;
import com.mds.mds.service.ServiceBucket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerBucket {

    @Autowired
    private ServiceBucket service;
    @PostMapping("/addBucket")
    public Bucket addBucket(@RequestBody Bucket bucket){
        return service.saveBucket(bucket);
    }

    @PostMapping("/addBuckets")
    public List<Bucket> addBuckets(@RequestBody List<Bucket> buckets){
        return service.saveBuckets(buckets);
    }

    @GetMapping("/buckets")
    public List<Bucket> findAllBuckets(){
        return service.getBuckets();
    }

    @GetMapping("/bucket/{id}")
    public Bucket findBucketById(@PathVariable int id){
        return service.getBucketById(id);
    }

//   @GetMapping("/produs/{nume}")
//    public Item findProductByName(@PathVariable String nume){
//        return service.getProdusByName(nume);
//    }

    @PutMapping("/updateBucket")
    public Bucket updateBucket(@RequestBody Bucket bucket){
        return service.updateBucket(bucket);
    }

    @DeleteMapping("/deleteBucket/{id}")
    public String deleteBucket(@PathVariable int id){
        return service.deleteBucket(id);
    }



}
