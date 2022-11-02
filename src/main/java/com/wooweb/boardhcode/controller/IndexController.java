package com.wooweb.boardhcode.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts");
        return null;
    }
}