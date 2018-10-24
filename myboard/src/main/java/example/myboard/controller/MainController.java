package example.myboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    public MainController(){
        System.out.println("MainController()!");
    }

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
