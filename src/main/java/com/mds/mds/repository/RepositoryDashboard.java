package com.mds.mds.repository;

import com.mds.mds.entity.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RepositoryDashboard extends JpaRepository<Dashboard,Integer> {

//   Item findByName(String nume);

}
