package com.wooweb.boardhcode.web;

import com.wooweb.boardhcode.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto responseDto(@RequestParam("name") String name,@RequestParam("amount") int amount ){
        return new HelloResponseDto(name, amount);

    }
}
