package com.Parking.slot.entry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingEntryRepository extends JpaRepository<ParkingEntry, Long> {
}
