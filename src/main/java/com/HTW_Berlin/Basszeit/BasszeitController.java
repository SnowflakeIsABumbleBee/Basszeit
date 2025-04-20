package com.HTW_Berlin.Basszeit;

import java.awt.Image;

import javax.swing.ImageIcon;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.awt.*;

@Controller
public class BasszeitController {

    @GetMapping(path = "/music")
    public ResponseEntity<Music> getMusic() {
        Image image = new ImageIcon(getClass().getResource("/com/HTW_Berlin/Basszeit/pic/pexels-tdcat-59523.jpg")).getImage();
        final Music music = new Music("Doggy", "Katja Krassavice", image);
        return ResponseEntity.ok(music);
    }
}
