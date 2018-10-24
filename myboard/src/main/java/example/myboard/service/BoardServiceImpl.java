package example.myboard.service;

import example.myboard.dao.BoardDao;
import example.myboard.dto.Board;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    private BoardDao boardDao;

    public BoardServiceImpl(BoardDao boardDao){
        System.out.println("Service()");
        this.boardDao = boardDao;
    }

    @Override
    public Long addBoard(Board board) {
        board.setReadCount(0);
        board.setRegdate(new Date());
        return boardDao.addBoard(board);
    }

    @Override
    public Board getBoard(Long id) {
        return boardDao.getBoard(id);
    }

    @Override
    public int updateBoard(Board board) {
        return boardDao.updateBoard(board);
    }

    @Override
    public int deleteBoard(Long id) {
        return boardDao.deleteBoard(id);
    }

    @Override
    public List<Board> getBoards(int start, int limit) {
        return boardDao.getBoards();
    }
}
