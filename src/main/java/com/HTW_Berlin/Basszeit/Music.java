package com.HTW_Berlin.Basszeit;

import java.awt.Image;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String interpret;
    private Image imageUrl; // Link zum Bild

    // Konstruktoren
    public Music() {
    }

    public Music(String title, String interpret, Image imageUrl) {
        this.title = title;
        this.interpret = interpret;
        this.imageUrl = imageUrl;
    }

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public Image getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Image imageUrl) {
        this.imageUrl = imageUrl;
    }
}
