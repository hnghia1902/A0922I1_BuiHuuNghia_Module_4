package com.example.ung_dung_nghe_nhac_don_gian.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.File;
@Entity
public class Song {
    @Id
    @GeneratedValue
    private int song_id;
    @Column(columnDefinition = "nvarchar(75)")
    private String song_name;
    @Column(columnDefinition = "nvarchar(75)")
    private String singer_name;
    @Column(columnDefinition = "nvarchar(75)")
    private String category;
    private String link;

    public Song() {
    }

    public Song(int song_id, String song_name, String singer_name, String category, String link) {
        this.song_id = song_id;
        this.song_name = song_name;
        this.singer_name = singer_name;
        this.category = category;
        this.link = link;
    }

    public int getSong_id() {
        return song_id;
    }

    public void setSong_id(int song_id) {
        this.song_id = song_id;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getSinger_name() {
        return singer_name;
    }

    public void setSinger_name(String singer_name) {
        this.singer_name = singer_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
