package com.HTW_Berlin.Basszeit;

import lombok.Getter;

@Getter
public class Music {


    private Long id;
    private String title;
    private String artist;

    public Music(Long id, String title, String artist) {
        this.id = id;
        this.title = title;
        this.artist = artist;    }

}


