package com.mds.mds.service;

import com.mds.mds.entity.DashboardPost;
import com.mds.mds.repository.RepositoryDashboardPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDashboardPost {
    @Autowired
    private RepositoryDashboardPost repository;

    public DashboardPost saveDashboardPost(DashboardPost dashboard){

        return repository.save(dashboard);
    }

    public ServiceDashboardPost() {
    }

    public List<DashboardPost> saveDashboardPosts(List<DashboardPost> dashboards){

        return repository.saveAll(dashboards);
    }

    public List<DashboardPost> getDashboardPosts(){
        return repository.findAll();
    }

    public DashboardPost getDashboardPostById(int id){
        return repository.findById(id).orElse(null);
    }

//   public Item getProdusByName(String nume){
//        return repository.findByName(nume);
//   }
//

    // TO DO si ca lista by name


    public String deleteDashboard(int id){
        repository.deleteById(id);
        return "Deleted dashboard || " + id;
    }

    public DashboardPost updateDashboardPost(DashboardPost dashboard){

        DashboardPost existingDashboard= repository.findById(dashboard.getId()).orElse(null);
        existingDashboard.setDashboardOwner(dashboard.getDashboardOwner());
        //existingDashboard.setMainFilter(dashboard.getMainFilter());
        existingDashboard.setPosts(dashboard.getPosts());
        //existingDashboard.setTags(dashboard.getTags());
        return repository.save(existingDashboard);
    }





}
