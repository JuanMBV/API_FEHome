package com.apifehome.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apifehome.demo.WikiScrapingService;

@RestController
@RequestMapping("/api")
public class ScrapingController {

    private final WikiScrapingService scrapingService;

    public ScrapingController(WikiScrapingService scrapingService) {
        this.scrapingService = scrapingService;
    }

    @GetMapping("/scrape-and-fill")
    public String scrapeAndFillDatabase() {
        // Llamar al servicio de scraping aquí
        scrapingService.scrapeAndStoreData();
        return "Scraping and filling of database completed.";
    }
}