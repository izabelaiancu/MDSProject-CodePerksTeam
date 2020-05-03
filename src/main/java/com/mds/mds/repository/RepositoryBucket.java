package com.mds.mds.repository;

import com.mds.mds.entity.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RepositoryBucket extends JpaRepository<Bucket,Integer> {

//   Item findByName(String nume);

}
