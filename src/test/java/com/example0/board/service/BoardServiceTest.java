//package com.example0.board.service;
//
//import com.example0.board.dto.request.BoardRequest;
//import com.example0.board.global.entity.Board;
//import com.example0.board.global.respository.BoardRepository;
//import org.junit.jupiter.api.Test;
//import org.mockito.BDDMockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//@Transactional
//class BoardServiceTest {
//    @Autowired
//    private BoardService boardService;
//    @Autowired
//    private BoardRepository boardRepository;
//
//
//    @Test
//    void insertBoard() {
//        //given
////        Board board = boardRepository.save(new Board());
////        BoardRequest request = new BoardRequest(boardName, boardTitle);
////        assertNotNull(board);
//        BoardRequest request = new BoardRequest("seoyeon","boardName");
//        int size = boardRepository.findAll().size();
//
//        //when
//        boardService.insertBoard(request);
//
//        //then
////        Optional<Board> savedBoard = boardRepository.findById(1l);
////        assertTrue(savedBoard.isPresent());
////        assertEquals("boardTitl", savedBoard.get().getBoardTitle());
////        assertEquals("boardName", savedBoard.get().getBoardName());
//        assertEquals(size+1,boardRepository.findAll().size());
//    }
//
//    @Test
////    void getBoards() {
////        //given
////        Board board = boardRepository.save(new Board());
////        boardService.getBoards(request);
////        //when
////        //then
//    }
//    @Test
//    void getById(){
//        BoardRequest boardRequest = new BoardRequest("test","test");
////        BDDMockito
//    }
//
//}