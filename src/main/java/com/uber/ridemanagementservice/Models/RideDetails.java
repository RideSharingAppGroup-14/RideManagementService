package com.uber.ridemanagementservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.security.PrivateKey;

@Entity
@Getter
@Setter
public class RideDetails extends BaseModel {
    private RideStatus rideStatus;
    private PaymentStatus paymentStatus;
    @ManyToOne
    private RiderDetails riderDetails;
}
