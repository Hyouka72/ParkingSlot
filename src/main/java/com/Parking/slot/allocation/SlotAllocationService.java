package com.Parking.slot.allocation;

import com.Parking.slot.event.VehicleEnteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class SlotAllocationService {

    private final SlotRepository slotRepository;

    public SlotAllocationService(SlotRepository slotRepository) {
        this.slotRepository = slotRepository;
    }

    @EventListener
    public void handleVehicleEntry(VehicleEnteredEvent event) {
        //find the available slot to allocate
        Slot slot = slotRepository.findFirstByAvailableTrue().orElseThrow(
                ()-> new RuntimeException("not available")
        );
        slot.setAvailable(false);
        slot.setVehicleNumber(event.vehicleNumber());
        //then update the slot db

    }
}
