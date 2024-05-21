package com.example.jpa.playlist.service;

import com.example.jpa.global.domain.dto.UserDto;
import com.example.jpa.global.domain.entity.Playlist;
import com.example.jpa.global.domain.entity.User;
import com.example.jpa.global.domain.repository.PlaylistRepository;
import com.example.jpa.playlist.dto.request.PlaylistRequest;
import com.example.jpa.playlist.dto.response.PlaylistResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaylistServiceImpl
implements PlaylistService{
    private final PlaylistRepository playlistRepository;
    @Override
    public void save(PlaylistRequest playlist) {
        playlistRepository.save(playlist.toEntity());
    }

    @Override

    public List<PlaylistResponse> getAll() {
//        playlistRepository.deleteById(id);

//        List<PlaylistResponse> responses = new ArrayList<>();

//        List<Playlist> all = playlistRepository.findAll();
//        for (Playlist playlist : all) {
//            PlaylistResponse response = new PlaylistResponse(playlist.getId(),
//                    playlist.getTitle(),
//                    new UserDto(
//                            playlist.getUser().getId()
//                            , playlist.getUser().getNickname()
//                    ));
//            responses.add(response);
//        }
        return playlistRepository.findAll()
                .stream()
                .map(PlaylistResponse::from)
                .toList();
//        return responses;
    }


}
