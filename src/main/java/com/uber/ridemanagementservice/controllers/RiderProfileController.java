package com.uber.ridemanagementservice.controllers;


import com.uber.ridemanagementservice.Dtos.RiderProfileDto;
import com.uber.ridemanagementservice.Services.RiderProfileService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/profile")
@RestController
public class RiderProfileController {


    private final RiderProfileService riderProfileService;

    public RiderProfileController(RiderProfileService riderProfileService){
        this.riderProfileService = riderProfileService;
    }


    @GetMapping("/{riderId}")
    public ResponseEntity<RiderProfileDto> getRiderProfile(@PathVariable Long id){
        RiderProfileDto riderProfileDto = riderProfileService.getRiderProfile(id);
        return new ResponseEntity<>(riderProfileDto, HttpStatus.OK);
    }
    @PutMapping("/{riderId}")
    public ResponseEntity<RiderProfileDto> updateRiderProfile(@PathVariable Long id, @RequestBody RiderProfileDto riderProfileDto){
        return null;
    }
}
