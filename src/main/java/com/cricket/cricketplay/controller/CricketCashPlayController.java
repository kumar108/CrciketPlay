package com.cricket.cricketplay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CricketCashPlayController {

    @GetMapping("/home")
    public String home() {
        return "index";
    }

}
