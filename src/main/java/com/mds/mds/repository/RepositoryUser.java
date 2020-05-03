package com.mds.mds.repository;

import com.mds.mds.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RepositoryUser extends JpaRepository<User,Integer> {

//   Item findByName(String nume);

}