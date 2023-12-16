package com.uber.ridemanagementservice.controllers;

import com.uber.ridemanagementservice.Dtos.DropoffLocationDto;
import com.uber.ridemanagementservice.Dtos.PickupLocationDto;
import com.uber.ridemanagementservice.Dtos.RideStatusDto;
import com.uber.ridemanagementservice.Services.RideService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ride")
public class RideController {

    RideService rideService;
    public RideController(RideService rideService){
        this.rideService= rideService;
    }

    @PostMapping()
    public ResponseEntity<RideStatusDto> addRide(@RequestBody PickupLocationDto pickup, DropoffLocationDto dropoff){
        return null;
    }

    @GetMapping("/status")
    public ResponseEntity<RideStatusDto> getRideStatus(@RequestBody RideStatusDto ride){
        return  null;
    }
    @PostMapping("/status")
    public ResponseEntity<RideStatusDto> setRideStatus(@RequestBody RideStatusDto ride){
        return null;
    }

    @GetMapping("/history/{riderId}")
    public  ResponseEntity<List<RideStatusDto>> getRideHistory(@PathVariable Long riderId){
        return null;
    }

}
