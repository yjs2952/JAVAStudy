package examples.daoexam.main;

import examples.daoexam.config.ApplicationConfig;
import examples.daoexam.dto.Board;
import examples.daoexam.service.BoardService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.List;

public class BoardServiceSelectTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac =
				new AnnotationConfigApplicationContext(ApplicationConfig.class);

		BoardService boardService = ac.getBean(BoardService.class);
		//Board board = boardService.getBoard(1L);
		List<Board> list = boardService.getBoards(2, 10);

		for (Board board : list) {
			System.out.println(board.toString());
		}
		//System.out.println(board);
	}

}
