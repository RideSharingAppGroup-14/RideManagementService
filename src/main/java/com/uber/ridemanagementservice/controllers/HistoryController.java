package com.uber.ridemanagementservice.controllers;

import com.uber.ridemanagementservice.Dtos.RiderProfileDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class HistoryController {


    @GetMapping("/history")
    public String getHistory(@PathVariable Long id){
        System.out.println(id);
        return "RideHistory";
    }

}
