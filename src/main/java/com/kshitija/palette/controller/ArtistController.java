package com.kshitija.palette.controller;

import com.kshitija.palette.entity.Artist;
import com.kshitija.palette.service.ArtistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artists")
@CrossOrigin("*")
public class ArtistController {

    private final ArtistService service;

    public ArtistController(ArtistService service) {
        this.service = service;
    }

    @PostMapping
    public Artist createArtist(
            @RequestBody Artist artist) {

        return service.createArtist(artist);
    }

    @GetMapping
    public List<Artist> getAllArtists() {
        return service.getAllArtists();
    }
}