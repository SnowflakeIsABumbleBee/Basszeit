package com.HTW_Berlin.Basszeit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
@Entity
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String title;
    private String artist;

    public Music() {}

    public Music(Long id, String title, String artist) {
        this.id = id;
        this.title = title;
        this.artist = artist;    }

}


