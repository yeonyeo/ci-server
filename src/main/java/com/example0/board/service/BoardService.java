package com.example0.board.service;

import com.example0.board.dto.request.BoardRequest;
import com.example0.board.global.entity.Board;

import java.util.List;


public interface BoardService {
    void insertBoard(BoardRequest boardRequest);
    List<Board> getBoards();
    void deleteBoard(Long boardId);
}
