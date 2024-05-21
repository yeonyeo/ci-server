package com.example.jpa.auth.dto.response;

import com.example.jpa.global.domain.dto.PlaylistDto;
import com.example.jpa.global.domain.entity.User;

import java.util.List;
import java.util.Map;

public record UserResponse (
        Long id,
        String nickname,
        List <PlaylistDto> playlists
){
    public static UserResponse from(User user) {
        return new UserResponse(user.getId(), user.getNickname(), user.getPlaylists().stream().map(
                playlist -> new PlaylistDto(playlist.getId(), playlist.getTitle())
        ).toList());
    }
}
