package com.Parking.slot;

import com.Parking.slot.allocation.Slot;
import com.Parking.slot.allocation.SlotRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SlotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlotApplication.class, args);
	}

	@Bean
	CommandLineRunner initSlots(SlotRepository repo) {
		return args -> {
			if(repo.count() == 0) {
				repo.save(new Slot(null, "A1", true, null));
				repo.save(new Slot(null, "A2", true, null));
				repo.save(new Slot(null, "A3", true, null));
			}
		};
	}
}
