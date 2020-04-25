package com.mds.mds;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TalkingToDatabase extends JpaRepository<Produse, Integer> {

  // custom query to search to blog post by title or content
   List<Produse> findByTitleContainingOrContentContaining(String text, String textAgain);

}