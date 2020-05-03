package com.mds.mds.repository;

import com.mds.mds.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RepositoryItem extends JpaRepository<Item,Integer> {

//   Item findByName(String nume);

}
