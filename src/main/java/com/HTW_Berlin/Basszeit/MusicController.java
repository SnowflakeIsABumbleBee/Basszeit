package com.HTW_Berlin.Basszeit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/music")
public class MusicController {

    private final MusicRepository musicRepository;

    @Autowired
    MusicService service;

    public MusicController(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @PostMapping("/repo")
    public Music createMusic(@RequestBody Music music) {
        return service.save(music);
    }

    @PostMapping("/{id}/vote")
    public ResponseEntity<?> vote(@PathVariable Long id) {
        Optional<Music> optionalMusic = musicRepository.findById(id);
        if (optionalMusic.isPresent()) {
            Music music = optionalMusic.get();
            music.setVotes(music.getVotes() + 1);
            musicRepository.save(music);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public Music getThing(@PathVariable String id) {
        Long thingId = Long.parseLong(id);
        return service.get(thingId);
    }

    @GetMapping("")
    public List<Music> getAllMusic() {
        return service.getAll();
    }
    @PostMapping("/reset-votes")
    public ResponseEntity<?> resetVotes() {
        List<Music> all = musicRepository.findAll();
        for (Music music : all) {
            music.setVotes(0);
        }
        musicRepository.saveAll(all);
        return ResponseEntity.ok("All votes reset.");
    }

}
