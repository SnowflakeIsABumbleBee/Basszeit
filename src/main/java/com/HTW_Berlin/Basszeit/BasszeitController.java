package com.HTW_Berlin.Basszeit;

import java.awt.Image;

import javax.swing.ImageIcon;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasszeitController {

    @GetMapping(path = "/music")
    public ResponseEntity<Music> getMusic() {
        final Music music = new Music("Doggy", "Katja Krassavice", image);
        return ResponseEntity.ok(music);
    }
}
