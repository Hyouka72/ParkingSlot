package com.Parking.slot.entry;

import com.Parking.slot.event.VehicleEnteredEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EntryService {
    //save vechicle entry details to DB
    //allocate a parking slot
    //send notification to the user
    private final ParkingEntryRepository repo;
    private final ApplicationEventPublisher publisher;

    public EntryService(ParkingEntryRepository repo, ApplicationEventPublisher publisher) {
        this.repo = repo;
        this.publisher = publisher;
    }
    public void vehicleEntry(String vehicleNumber)
    {
        ParkingEntry entry = new ParkingEntry(null, vehicleNumber, LocalDateTime.now(),null,true);
        repo.save(entry);

        //publish an event
        publisher.publishEvent(new VehicleEnteredEvent(vehicleNumber, entry.getEntryTime()));

    }
}
