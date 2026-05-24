package com.kshitija.palette.service;

import com.kshitija.palette.entity.Artwork;
import com.kshitija.palette.repository.ArtworkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtworkService {

    private final ArtworkRepository repository;

    public ArtworkService(ArtworkRepository repository) {
        this.repository = repository;
    }

    public Artwork createArtwork(Artwork artwork) {
        return repository.save(artwork);
    }

    public List<Artwork> getAllArtworks() {
        return repository.findAll();
    }
}