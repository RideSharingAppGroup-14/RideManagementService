package com.uber.ridemanagementservice.Services;

import com.uber.ridemanagementservice.Dtos.RiderProfileDto;
import com.uber.ridemanagementservice.Models.RiderDetails;
import com.uber.ridemanagementservice.Repositories.RiderProfileRepository;

import java.util.Optional;

public class RiderProfileServiceImp implements RiderProfileService{
        RiderProfileRepository riderProfileRepository;

    @Override
    public RiderProfileDto getRiderProfile(Long riderId) {
        Optional<RiderDetails> riderOptional = riderProfileRepository.findById(riderId);
        if (riderOptional.isEmpty()){
            return null;
        }
        return RiderProfileDto.from(riderOptional.get());
    }

    @Override
    public void updateRiderProfile(Long riderId, RiderProfileDto riderProfileDto) {

        Optional<RiderDetails> riderOptional = riderProfileRepository.save()  //findById(riderId);
        if (riderOptional.isEmpty()){
            return null;
        }
        return RiderProfileDto.from(riderOptional.get());
    }


//    RiderProfileDto getUserDetails(Long userId);//{
//
//    }

//    public UserDto setUserRoles(Long userId, List<Long> roleIds){
//        Optional<User> userOptional = userRepository.findById(userId);
//        List<Role> roles = roleRepository.findAllByIdIn(roleIds);
//
//        if (userOptional.isEmpty()){
//            return null;
//        }

//    void updateProfile(UUID driverId, ProfileUpdateDto profileUpdateDto);

}
