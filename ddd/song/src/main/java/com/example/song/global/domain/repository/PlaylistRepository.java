package com.example.jpa.global.domain.repository;

import com.example.jpa.global.domain.entity.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlaylistRepository
extends JpaRepository<Playlist, Long> {
    //named query
    // select * from playlists where playlist_title = ?
    List<Playlist> findByTitle(String title);
//jpa에서 쿼리는 거 jpql 문법
    //entity query
    //
    @Query("select pl from Playlist pl" +
    "join fetch pl.user u")
    List<Playlist> findAllPlaylists();
}
