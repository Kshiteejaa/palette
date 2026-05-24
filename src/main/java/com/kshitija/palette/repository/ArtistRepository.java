package com.kshitija.palette.repository;

import com.kshitija.palette.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository
        extends JpaRepository<Artist, Long> {
}