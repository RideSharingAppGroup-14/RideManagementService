package com.uber.ridemanagementservice.controllers;

import com.uber.ridemanagementservice.Dtos.RideStatusDto;
import com.uber.ridemanagementservice.Services.ActiveRideService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ride/active")
public class ActiveRideController {
    private ActiveRideService activeRideService;

    public ActiveRideController (ActiveRideService activeRideService){
        this.activeRideService = activeRideService;
    }
    @GetMapping("{riderId}")
    public ResponseEntity<RideStatusDto> getActiveRide(@PathVariable Long riderId){
        return  null;
    }
    @PostMapping("/cancel/{riderId}")
    public ResponseEntity<RideStatusDto> CancelActiveRide(@PathVariable Long riderId){
        return  null;
    }
}
