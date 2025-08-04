package com.Parking.slot.entry;

import com.Parking.slot.event.VehicleEnteredEvent;
import com.Parking.slot.event.VehicleExitedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ExitService {
    private final ParkingEntryRepository repo;
    private final ApplicationEventPublisher publisher;

    public ExitService(ParkingEntryRepository repo, ApplicationEventPublisher publisher) {
        this.repo = repo;
        this.publisher = publisher;
    }
    public void vehicleEntry(String vehicleNumber)
    {
        //get vehicle detail from DB
        //update exit time
        //save to db
        //publish vehicle exited event

        ParkingEntry exit  = repo.findByVehicleNumberAndActiveTrue(vehicleNumber)
                .orElseThrow(()-> new RuntimeException("No active entry found"));
        exit.setExitTime(LocalDateTime.now());
        exit.setActive(false);
        repo.save(exit);
        publisher.publishEvent(new VehicleExitedEvent(vehicleNumber, exit.getExitTime()));
    }
}
