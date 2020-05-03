package com.mds.mds.service;

import com.mds.mds.entity.Dashboard;
import com.mds.mds.repository.RepositoryDashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDashboard{
    @Autowired
    private RepositoryDashboard repository;

    public Dashboard saveDashboard(Dashboard dashboard){

        return repository.save(dashboard);
    }

    public ServiceDashboard() {
    }

    public List<Dashboard> saveDashboards(List<Dashboard> dashboards){

        return repository.saveAll(dashboards);
    }

    public List<Dashboard> getDashboards(){
        return repository.findAll();
    }

    public Dashboard getDashboardById(int id){
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

    public Dashboard updateDashboard(Dashboard dashboard){

        Dashboard existingDashboard= repository.findById(dashboard.getId()).orElse(null);
        existingDashboard.setDashboardOwner(dashboard.getDashboardOwner());
        existingDashboard.setMainFilter(dashboard.getMainFilter());
        existingDashboard.setPosts(dashboard.getPosts());
        existingDashboard.setTags(dashboard.getTags());
        return repository.save(existingDashboard);
    }





}
