package com.SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class ControllerClass {
    public static void GetCurrentTime() {
    }

    @RequestMapping("/status")
    public String showMessage(){
        LocalTime time=LocalTime.now();
        return  "Running, "+time;
    }
}

