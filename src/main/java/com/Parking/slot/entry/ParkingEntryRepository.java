package com.Parking.slot.entry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParkingEntryRepository extends JpaRepository<ParkingEntry, Long> {
    Optional<ParkingEntry> findByVehicleNumberAndActiveTrue(String vehicleNumber);
}
