package example.myboard.controller;

import example.myboard.dto.Board;
import example.myboard.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoardController {

    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/boards")
    public String list(ModelMap modelMap, @RequestParam(name = "page") String page) {
        if (page != null) {
            int pageNo = Integer.parseInt(page);
            List<Board> list = boardService.getBoards(pageNo, 10);
        }

        return "list";
    }

    @GetMapping("/boards/getBoard")
    public String getBoard(ModelMap modelMap, @RequestParam(name = "id") Long id){
        Board board = boardService.getBoard(id);
        modelMap.addAttribute( board);
        return "/boards/boardview";
    }

    @GetMapping("boards/writeForm")
    public String writeForm(){
        return "writeform";
    }

    @PostMapping("boards/writeBoard")
    public String write(@ModelAttribute Board board) {
        boardService.addBoard(board);
        return "redirect:/boards";
    }

    @GetMapping("/boards/updateForm")
    public String updateForm(){
        return "updateForm";
    }

    @PostMapping("/boards/updateBoard")
    public String updateBoard(@ModelAttribute Board board){
        boardService.updateBoard(board);
        return "redirect:/boards/boardView?id="+board.getId();
    }

    @GetMapping("/boards/deleteBoard")
    public String deleteBoard(@RequestParam(name = "id") Long id) {
        boardService.deleteBoard(id);
        return "redirect:/boards";
    }
}
