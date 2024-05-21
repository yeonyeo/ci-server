package com.example0.board.service;

import com.example0.board.dto.request.BoardRequest;
import com.example0.board.global.entity.Board;
import com.example0.board.global.respository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;
//
    @Override
    public void insertBoard(BoardRequest boardRequest) {
        boardRepository.save(boardRequest.toEntity());
    }

    @Override
    public List<Board> getBoards() {
        return boardRepository.findAll();
    }

//////
}
