package com.Parking.slot.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EntryService {
    //save vechicle entry details to DB
    //allocate a parking slot
    //send notification to the user
    private final ParkingEntryRepository repo;

    public EntryService(ParkingEntryRepository repo) {
        this.repo = repo;
    }
    public void vehicleEntry(String vehicleNumber)
    {
        ParkingEntry entry = new ParkingEntry(null, vehicleNumber, LocalDateTime.now(),null,true);
        repo.save(entry);
    }
}
