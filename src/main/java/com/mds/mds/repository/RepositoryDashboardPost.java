package com.mds.mds.repository;

import com.mds.mds.entity.DashboardPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RepositoryDashboardPost extends JpaRepository<DashboardPost,Integer> {

//   Item findByName(String nume);

}
