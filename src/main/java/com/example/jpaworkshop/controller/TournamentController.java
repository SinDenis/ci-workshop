package com.example.jpaworkshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tournament")
public class TournamentController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

}
