//package com.mds.mds.service;
//
//import com.mds.mds.entity.MainFilter;
//import com.mds.mds.repository.RepositoryMainFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ServiceMainFilter {
//    @Autowired
//    private RepositoryMainFilter repository;
//
//    public MainFilter saveMainFilter(MainFilter mainFilter){
//
//        return repository.save(mainFilter);
//    }
//
//    public ServiceMainFilter() {
//    }
//
//    public List<MainFilter> saveMainFilters(List<MainFilter> mainFilters){
//
//        return repository.saveAll(mainFilters);
//    }
//
//    public List<MainFilter> getMainFilters(){
//        return repository.findAll();
//    }
//
//    public MainFilter getMainFilterById(int id){
//        return repository.findById(id).orElse(null);
//    }
//
////   public Item getProdusByName(String nume){
////        return repository.findByName(nume);
////   }
////
//
//    // TO DO si ca lista by name
//
//
//    public String deleteMainFilter(int id){
//        repository.deleteById(id);
//        return "Deleted mainFilter || " + id;
//    }
//
//    public MainFilter updateMainFilter(MainFilter mainFilter){
//
//        MainFilter existingMainFilter = repository.findById(mainFilter.getId()).orElse(null);
//        existingMainFilter.setAges(mainFilter.getAges());
//        existingMainFilter.setBrands(mainFilter.getBrands());
//        existingMainFilter.setCategories(mainFilter.getCategories());
//        existingMainFilter.setGenders(mainFilter.getGenders());
//        existingMainFilter.setCounty(mainFilter.getCounty());
//        existingMainFilter.setPrice(existingMainFilter.getPrice());
//        existingMainFilter.setStyles(mainFilter.getStyles());
//        return repository.save(existingMainFilter);
//    }
//
//
//
//
//
//}
