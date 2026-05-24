package com.kshitija.palette.controller;

import com.kshitija.palette.entity.Artwork;
import com.kshitija.palette.service.ArtworkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artworks")
@CrossOrigin("*")
public class ArtworkController {

    private final ArtworkService service;

    public ArtworkController(ArtworkService service) {
        this.service = service;
    }

    @PostMapping
    public Artwork createArtwork(
            @RequestBody Artwork artwork) {

        return service.createArtwork(artwork);
    }

    @GetMapping
    public List<Artwork> getAllArtworks() {
        return service.getAllArtworks();
    }
}