package com.HTW_Berlin.Basszeit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasszeitService {
   @Autowired
   BasszeitRepository repo;

   public Music save(Music music) {
       return repo.save(music);
   }
   public Music get(Long id) {
       return repo.findById(id).orElseThrow(() -> new RuntimeException("Music not found"));
   }
}
