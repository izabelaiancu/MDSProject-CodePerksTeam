package com.mds.mds.repository;

import com.mds.mds.entity.Produse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RepositoryProduse extends JpaRepository<Produse,Integer> {

//   Produse findByName(String nume);

}
