package com.kshitija.palette.entity;

import jakarta.persistence.*;
import java.util.List;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String bio;

    private String email;

    @OneToMany(mappedBy = "artist",
            cascade = CascadeType.ALL)
    private List<Artwork> artworks;

    public Artist() {
    }

    public Artist(Long id,
                  String name,
                  String bio,
                  String email) {

        this.id = id;
        this.name = name;
        this.bio = bio;
        this.email = email;
    }
}