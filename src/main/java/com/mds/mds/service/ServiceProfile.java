package com.mds.mds.service;

import com.mds.mds.entity.Profile;
import com.mds.mds.repository.RepositoryProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProfile {
    @Autowired
    private RepositoryProfile repository;

    public Profile saveProfile(Profile profile){

        return repository.save(profile);
    }

    public ServiceProfile() {
    }

    public List<Profile> saveProfiles(List<Profile> profiles){

        return repository.saveAll(profiles);
    }

    public List<Profile> getProfiles(){
        return repository.findAll();
    }

    public Profile getProfileById(int id){
        return repository.findById(id).orElse(null);
    }

//   public Item getProdusByName(String nume){
//        return repository.findByName(nume);
//   }
//

    // TO DO si ca lista by name


    public String deleteProfile(int id){
        repository.deleteById(id);
        return "Deleted profile || " + id;
    }

    public Profile updateProfile(Profile profile){

        Profile existingProfile = repository.findById(profile.getId()).orElse(null);
        existingProfile.setProfileOwner(profile.getProfileOwner());
        existingProfile.setProfilePic(profile.getProfilePic());
        existingProfile.setAddress(profile.getAddress());
        existingProfile.setDescription(profile.getDescription());
        existingProfile.setPosts(profile.getPosts());
        existingProfile.setTags(profile.getTags());
        existingProfile.setFollowers(profile.getFollowers());
        existingProfile.setFollowing(profile.getFollowing());
        return repository.save(existingProfile);
    }





}
