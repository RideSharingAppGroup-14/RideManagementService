package com.uber.ridemanagementservice.Dtos;

import com.uber.ridemanagementservice.Models.RiderDetails;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RiderProfileDto {
    String name;
    String email;
    Long phoneNumber;
    String gender;
    public static  RiderProfileDto from(RiderDetails rider){
        RiderProfileDto riderProfileDto = new RiderProfileDto();
        riderProfileDto.setEmail(rider.getEmail());
        return riderProfileDto;
    }
}
