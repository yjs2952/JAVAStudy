package example.myboard.controller;

import example.myboard.dto.Board;
import example.myboard.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/boards")
public class BoardController {

    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/list")
    public String list(ModelMap modelMap, Integer page) {
        if (page == null) {
            page = 1;
        }

        List<Board> list = boardService.getBoards(page, 10);
        modelMap.addAttribute("boards", list);
        return "list";
    }

    @GetMapping("/getBoard")
    public String getBoard(ModelMap modelMap, @RequestParam(name = "id") Long id){
        Board board = boardService.getBoard(id);
        modelMap.addAttribute(board);
        return "boardView";
    }

    @GetMapping("/writeForm")
    public String writeForm(){
        return "writeform";
    }

    @PostMapping("/writeBoard")
    public String write(@ModelAttribute Board board) {
        boardService.addBoard(board);
        return "redirect:/boards/list";
    }

    @GetMapping("/updateForm")
    public String updateForm(ModelMap modelMap, @RequestParam Long id){
        if (id == null) {
            return "list";
        }
        Board board = boardService.getBoard(id);
        modelMap.addAttribute(board);
        return "updateForm";
    }

    @PostMapping("/updateBoard")
    public String updateBoard(@ModelAttribute Board board){
        boardService.updateBoard(board);
        return "redirect:/boards/getBoard?id="+board.getId();
    }

    @GetMapping("/deleteBoard")
    public String deleteBoard(@RequestParam(name = "id") Long id) {
        boardService.deleteBoard(id);
        return "redirect:/boards/list";
    }
}
