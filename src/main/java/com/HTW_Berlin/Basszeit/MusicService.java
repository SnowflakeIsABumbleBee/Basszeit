package com.HTW_Berlin.Basszeit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    MusicRepository repo;

    public Music save(Music music) {
        return repo.save(music);
    }

    public Music get(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Music not found"));
    }

    public List<Music> getAll() {
        return repo.findAll();
    }

}
