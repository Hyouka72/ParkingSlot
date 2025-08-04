package com.Parking.slot.event;

import java.time.LocalDateTime;

public record VehicleEnteredEvent(String vehicleNumber, LocalDateTime entryTime) {

}