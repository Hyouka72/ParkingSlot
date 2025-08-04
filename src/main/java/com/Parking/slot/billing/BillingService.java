package com.Parking.slot.billing;


import com.Parking.slot.event.VehicleEnteredEvent;
import com.Parking.slot.event.VehicleExitedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class BillingService {
    private BillingRecordRepository repo;

    public BillingService(BillingRecordRepository repo) {
        this.repo = repo;
    }

    @EventListener
    public void handleVechicleExit(VehicleExitedEvent event) {
        // calculate the bill on 20rs per hrs
        Duration duration = Duration.between(event.entryTime(), event.exitTime());
        double amount = (duration.toMinutes() / 60.0)*20;
        BillingRecord billingRecord = new BillingRecord(null, event.vehicleNumber(),amount,event.exitTime());
    repo.save(billingRecord);
        System.out.println("Billing record exited for " + event.vehicleNumber()+" is Rs."+amount);
    }

}
