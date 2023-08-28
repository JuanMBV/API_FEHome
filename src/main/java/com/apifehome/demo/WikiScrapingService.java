package com.apifehome.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import com.apifehome.persistence.repository.HeroRepository;

@Service
public class WikiScrapingService {
    
    private final HeroRepository heroRepository;

    public WikiScrapingService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public void scrapeAndStoreData(){
        String URL = "https://feheroes.fandom.com/wiki/Main_Page";
        try {
            Document doc = Jsoup.connect(URL).get();
            
            // Aquí puedes utilizar selectores de Jsoup para seleccionar elementos y extraer datos
            // Ejemplo:
            // String title = doc.select("h1").text();
            
            // Procesar y almacenar los datos en tu base de datos
            // Ejemplo:
            // saveDataToDatabase(title);
            
        } catch (Exception e) {
            e.printStackTrace();
            // Manejo de errores
        }
    }
    
}
