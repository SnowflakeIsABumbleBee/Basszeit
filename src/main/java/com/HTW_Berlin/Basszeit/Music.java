package com.HTW_Berlin.Basszeit;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String artist;
    @Setter
    @Column(nullable = false)
    private int votes = 0;

    public Music() {}

    public Music(Long id, String title, String artist, int votes) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.votes = votes;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
    public int getVotes() {
        return votes;
    }

}
