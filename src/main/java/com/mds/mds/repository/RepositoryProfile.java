package com.mds.mds.repository;

import com.mds.mds.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RepositoryProfile extends JpaRepository<Profile,Integer> {

//   Item findByName(String nume);

}
