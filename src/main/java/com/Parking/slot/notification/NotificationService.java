package com.Parking.slot.notification;

import com.Parking.slot.event.VehicleEnteredEvent;
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
}
