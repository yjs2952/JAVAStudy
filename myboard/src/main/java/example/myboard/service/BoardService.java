package example.myboard.service;

import example.myboard.dto.Board;

import java.util.List;

public interface BoardService {
    Long addBoard(Board board);

    Board getBoard(Long id);

    int updateBoard(Board board);

    int deleteBoard(Long id);

    List<Board> getBoards(int start, int limit);
}
