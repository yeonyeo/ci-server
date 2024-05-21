package com.example0.board.controller;

import com.example0.board.dto.request.BoardRequest;
import com.example0.board.global.entity.Board;
import com.example0.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/boards")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;
    @PostMapping
    public void insertBoard(@RequestBody BoardRequest req) {
        boardService.insertBoard(req);
    }

    @GetMapping
    public List<Board> getBoards() {
        return boardService.getBoards();
    }


}
