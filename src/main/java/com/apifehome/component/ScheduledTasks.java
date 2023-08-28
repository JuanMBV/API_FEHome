package com.apifehome.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.apifehome.demo.WikiScrapingService;

@Component
public class ScheduledTasks {

    private final WikiScrapingService scrapingService;

    public ScheduledTasks(WikiScrapingService scrapingService) {
        this.scrapingService = scrapingService;
    }

    @Scheduled(initialDelay = 1000, fixedDelay = Long.MAX_VALUE) // Ejecutar una vez después de 1 segundo
    public void scrapeAndStoreData() {
        scrapingService.scrapeAndStoreData();
    }
}