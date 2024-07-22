package com.dzmitrybeinia.weighttracker;

import org.springframework.boot.SpringApplication;

public class TestWeightTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.from(WeightTrackerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
