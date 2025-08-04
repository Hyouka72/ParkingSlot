package com.Parking.slot.event;

import java.time.LocalDateTime;

public record VehicleExitedEvent(String vehicleNumber, LocalDateTime exitTime) {


}

