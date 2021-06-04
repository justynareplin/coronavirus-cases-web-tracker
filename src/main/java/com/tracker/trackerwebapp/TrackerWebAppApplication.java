package com.tracker.trackerwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TrackerWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrackerWebAppApplication.class, args);
    }

}
