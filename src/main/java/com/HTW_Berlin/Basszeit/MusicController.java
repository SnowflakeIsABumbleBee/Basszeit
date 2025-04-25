package com.HTW_Berlin.Basszeit;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusicController {

    @GetMapping(path = "/music")
    public ResponseEntity<Music> getMusic() {
        final Music music = new Music("Doggy", "Katja Krassavice");
        return ResponseEntity.ok(music);
    }
}
