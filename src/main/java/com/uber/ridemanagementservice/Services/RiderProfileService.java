package com.uber.ridemanagementservice.Services;

import com.uber.ridemanagementservice.Dtos.RiderProfileDto;
import com.uber.ridemanagementservice.Models.RiderDetails;
import com.uber.ridemanagementservice.Repositories.RiderProfileRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface RiderProfileService {
//    RiderProfileRepository riderProfileRepository;
    RiderProfileDto getRiderProfile(Long riderId);
    void updateRiderProfile(Long riderId, RiderProfileDto riderProfileDto);
}
