package com.mds.mds.service;

import com.mds.mds.entity.Bucket;
import com.mds.mds.repository.RepositoryBucket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBucket {
    @Autowired
    private RepositoryBucket repository;

    public Bucket saveBucket(Bucket bucket){

        return repository.save(bucket);
    }

    public ServiceBucket() {
    }

    public List<Bucket> saveBuckets(List<Bucket> buckets){

        return repository.saveAll(buckets);
    }

    public List<Bucket> getBuckets(){
        return repository.findAll();
    }

    public Bucket getBucketById(int id){
        return repository.findById(id).orElse(null);
    }

//   public Item getProdusByName(String nume){
//        return repository.findByName(nume);
//   }
//

    // TO DO si ca lista by name


    public String deleteBucket(int id){
        repository.deleteById(id);
        return "Deleted bucket || " + id;
    }

    public Bucket updateBucket(Bucket bucket){

        Bucket existingBucket = repository.findById(bucket.getId()).orElse(null);
        existingBucket.setBucketOwner(bucket.getBucketOwner());
        existingBucket.setDeliveryAddress(bucket.getDeliveryAddress());
        existingBucket.setPosts(bucket.getPosts());
        existingBucket.setTotalPrice(bucket.getTotalPrice());
        return repository.save(existingBucket);
    }





}
