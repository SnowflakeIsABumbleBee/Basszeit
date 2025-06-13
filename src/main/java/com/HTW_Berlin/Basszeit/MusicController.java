package com.HTW_Berlin.Basszeit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")@RestController
public class MusicController {

    @Autowired
    MusicService musicService;

    @PostMapping
    public Music createMusic(@RequestBody Music music) {
        return musicService.save(music);
    }

    @GetMapping(path = "/music")
    public ResponseEntity<List<Music>> getMusic() {
        List<Music> musicList = List.of(
                new Music(1L, "Doggy", "Katja Krassavice"),
                new Music(2L, "Tomasz", "573059")
        );
        return ResponseEntity.ok(musicList);
    }

}
