package com.uber.ridemanagementservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class RiderDetails extends BaseModel{
    private String name;
    private String email;
    private String gender;
    private Long phoneNumber;
    @OneToMany
    private Set<RideDetails> rideDetails = new HashSet<>();

}
