package com.uber.ridemanagementservice.Repositories;

import com.uber.ridemanagementservice.Models.BaseModel;
import com.uber.ridemanagementservice.Models.RiderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderProfileRepository extends JpaRepository<RiderDetails, Long> {
}
