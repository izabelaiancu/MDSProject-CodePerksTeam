package com.mds.mds.service;

import com.mds.mds.entity.Post;
import com.mds.mds.repository.RepositoryPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePost {
    @Autowired
    private RepositoryPost repository;

    public Post savePost(Post post){

        return repository.save(post);
    }

    public ServicePost() {
    }

    public List<Post> savePosts(List<Post> posts){

        return repository.saveAll(posts);
    }

    public List<Post> getPosts(){
        return repository.findAll();
    }

    public Post getPostById(int id){
        return repository.findById(id).orElse(null);
    }

//   public Item getProdusByName(String nume){
//        return repository.findByName(nume);
//   }
//

    // TO DO si ca lista by name


    public String deletePost(int id){
        repository.deleteById(id);
        return "Deleted post || " + id;
    }

    public Post updatePost(Post post){

        Post existingPost = repository.findById(post.getId()).orElse(null);
        existingPost.setPostOwner(post.getPostOwner());
        existingPost.setAvailable(post.getAvailable());
        existingPost.setDate(post.getDate());
        return repository.save(existingPost);
    }





}
