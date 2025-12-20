package com.example.time;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TimeController {

    @GetMapping("/time")
    public String time() {
        return "Current Time: " + LocalDateTime.now();
    }
}

