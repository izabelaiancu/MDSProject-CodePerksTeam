package com.mds.mds.repository;

import com.mds.mds.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RepositoryPost extends JpaRepository<Post,Integer> {

//   Item findByName(String nume);

}
