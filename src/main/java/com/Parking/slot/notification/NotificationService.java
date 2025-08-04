package com.Parking.slot.notification;

import com.Parking.slot.event.VehicleEnteredEvent;
import com.Parking.slot.event.VehicleExitedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NotificationService {
    @EventListener
    public void notifyOnVehicleEntry(VehicleEnteredEvent event) {
        System.out.println("Notification: Vechile" + event.vehicleNumber()
        +" entered at " + LocalDateTime.now());
    }

    @EventListener
    public void notifyOnVehicleExit(VehicleExitedEvent event) {
        System.out.println("Notification: Vechile" + event.vehicleNumber()+" exited at " + LocalDateTime.now());
    }
}
