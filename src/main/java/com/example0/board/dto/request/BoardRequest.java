package com.example0.board.dto.request;

import com.example0.board.global.entity.Board;

public record BoardRequest(
    String boardName,
    String boardTitle
) {
    public Board toEntity() {
        return Board.builder()
                .boardTitle(boardTitle)
                .boardName(boardName)
                .build();
    }
}



