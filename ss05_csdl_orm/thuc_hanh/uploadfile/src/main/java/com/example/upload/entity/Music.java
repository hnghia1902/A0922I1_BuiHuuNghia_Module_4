package com.example.upload.entity;

import javax.persistence.*;

@Entity
public class Music {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true)
        private String name;

        @Lob
        private byte[] content;


    public Music() {
    }

    public Music(Long id, String name, byte[] content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return content;
    }

    public byte[] setContent(byte[] content) {
        this.content = content;
        return content;
    }


}
