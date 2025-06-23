package com.HTW_Berlin.Basszeit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")@RestController
public class MusicController {

    @Autowired
    MusicService service;

    @PostMapping(path="/repo")
    public Music createMusic(@RequestBody Music music) {
        return service.save(music);
    }

    @GetMapping("/music/{id}")
    public Music getThing(@PathVariable String id) {
        Long thingId = Long.parseLong(id);
        return service.get(thingId);
    }
    @GetMapping("/music")
    public List<Music> getAllMusic() {
        return service.getAll();
    }

}
