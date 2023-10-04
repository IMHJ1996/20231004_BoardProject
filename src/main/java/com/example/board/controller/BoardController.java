package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    @GetMapping("/save")
    public String saveForm(){
        return "/save";
    }
    @PostMapping ("/save")
    public String login(){
        return "/list";
    }

}
