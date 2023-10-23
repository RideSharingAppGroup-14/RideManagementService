package com.uber.ridemanagementservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HistoryController {


    @GetMapping("/history")
    public String getHistory(){
        return "RideHistory";
    }

}
