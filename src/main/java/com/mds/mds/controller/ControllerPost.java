package com.mds.mds.controller;

import com.mds.mds.entity.Post;
import com.mds.mds.service.ServicePost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerPost {

    @Autowired
    private ServicePost service;
    @PostMapping("/addPost")
    public Post addPost(@RequestBody Post post){
        return service.savePost(post);
    }

    @PostMapping("/addPosts")
    public List<Post> addPosts(@RequestBody List<Post> posts){
        return service.savePosts(posts);
    }

    @GetMapping("/posts")
    public List<Post> findAllPosts(){
        return service.getPosts();
    }

    @GetMapping("/post/{id}")
    public Post findPostById(@PathVariable int id){
        return service.getPostById(id);
    }

//   @GetMapping("/produs/{nume}")
//    public Item findProductByName(@PathVariable String nume){
//        return service.getProdusByName(nume);
//    }

    @PutMapping("/updatePost")
    public Post updatePost(@RequestBody Post post){
        return service.updatePost(post);
    }

    @DeleteMapping("/deletePost/{id}")
    public String deletePost(@PathVariable int id){
        return service.deletePost(id);
    }



}
