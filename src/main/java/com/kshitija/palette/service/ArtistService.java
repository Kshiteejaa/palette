package com.kshitija.palette.service;

import com.kshitija.palette.entity.Artist;
import com.kshitija.palette.repository.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    private final ArtistRepository repository;

    public ArtistService(ArtistRepository repository) {
        this.repository = repository;
    }

    public Artist createArtist(Artist artist) {
        return repository.save(artist);
    }

    public List<Artist> getAllArtists() {
        return repository.findAll();
    }
}