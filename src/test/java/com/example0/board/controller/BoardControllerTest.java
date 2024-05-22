package com.example0.board.controller;

import com.example0.board.dto.response.BoardResponse;
import com.example0.board.global.entity.Board;
import com.example0.board.service.BoardServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(BoardController.class)
class BoardControllerTest {
    @MockBean
    private BoardServiceImpl boardService;
    @Autowired
    private MockMvc mockMvc;
    @Test
    void insertBoard() {
    }

    @Test
    void getBoards() {
        //TDD test driven design
        //DDD domian
        // BDD business driven design
        // momnolithic 하나로 묶어서 개발하는거 10억
        //MSA service 나누는 거 13억
        //EDA 이벤트 driven  아키텍처

        BDDMockito.given(boardService.getAll())
                .willReturn(List.of(
                        new BoardResponse(1l,"test1","test1")

                ));
        mockMvc.perform(MockMvcBuilder.get("/api/boards"))
                .andExecpt(
                        MockMvcResultMatchers.jsonPath(()
                )

    }
}