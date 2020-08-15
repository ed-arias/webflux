package com.apirest.webflux.repositories;

import com.apirest.webflux.documents.Playlist;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {
    
}