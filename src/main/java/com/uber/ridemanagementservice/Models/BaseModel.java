package com.uber.ridemanagementservice.Models;

import jakarta.persistence.*;

@Entity
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
