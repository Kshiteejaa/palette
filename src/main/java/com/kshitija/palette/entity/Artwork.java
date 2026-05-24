package com.kshitija.palette.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Artwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Double price;

    private String category;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    @JsonIgnore
    private Artist artist;

    public Artwork() {
    }

    public Artwork(Long id,
                   String title,
                   Double price,
                   String category,
                   Artist artist) {

        this.id = id;
        this.title = title;
        this.price = price;
        this.category = category;
        this.artist = artist;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}