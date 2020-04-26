package com.mds.mds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

//import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerProduse {

    @Autowired
    TalkingToDatabase talkingProduse;

    @GetMapping("/Produse")
    public List<Produse> index(){
        return talkingProduse.findAll();
    }

    @GetMapping("/Produse/{id}")
    public Produse show(@PathVariable String id){
        int produsId = Integer.parseInt(id);
        return talkingProduse.findById(produsId);
    }

    @PostMapping("/Produse/nume")
    public List<Produse> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        return talkingProduse.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
    }

    @PostMapping("/Produse")
    public Produse create(@RequestBody Map<String, String> body){
        String nume = body.get("nume");
        String pret = body.get("pret");
        return talkingProduse.save(new Produse(nume, Double.parseDouble(pret)));

    }

    @PutMapping("/Produse/{id}")
    public Produse update(@PathVariable String id, @RequestBody Map<String, String> body){
        int blogId = Integer.parseInt(id);
        // getting blog
        Produse produse = talkingProduse.findById(blogId);
        produse.
        produse.s(body.get("content"));
        return blogRespository.save(blog);
    }

    @DeleteMapping("Produse/{id}")
    public boolean delete(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        blogRespository.delete(blogId);
        return true;
    }


}