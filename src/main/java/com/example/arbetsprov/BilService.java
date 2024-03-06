package com.example.arbetsprov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Service-klassen {@code BilService} ansvarar för att hantera operationer relaterade till bilar,
 * inklusive att hämta en lista över bilar från ett externt API och att beräkna genomsnittspriset
 * baserat på bränsletyp.
 */
@Service
public class BilService {

    private final RestTemplate restTemplate;

    /**
     * Konstruerar {@code BilService} med en instans av {@code RestTemplate}.
     * {@code RestTemplate} används för att göra HTTP-förfrågningar till det externa API:et.
     *
     * @param restTemplate Den {@code RestTemplate} som ska användas för HTTP-förfrågningar.
     */
    @Autowired
    public BilService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Hämtar en lista av {@code Bil}-objekt från det angivna API:et. Denna metod använder
     * paginering för att iterativt hämta alla bilar genom att följa länken till nästa sida
     * tills det inte finns fler sidor att hämta.
     *
     * @param initialUrl URL:en till API:et som ska anropas för att börja hämta bilar.
     * @return En lista av {@code Bil}-objekt.
     */
    public List<Bil> getBilar(String initialUrl) {
        List<Bil> allBilar = new ArrayList<>();
        String url = initialUrl;
        APIResponse response;

        while (url != null && !url.isEmpty()) {
            response = restTemplate.getForObject(url, APIResponse.class);
            if (response != null && response.getResults() != null && !response.getResults().isEmpty()) {
                allBilar.addAll(response.getResults());
                url = response.getNext();
            } else {
                break;
            }
        }

        return allBilar;
    }

    /**
     * Beräknar och returnerar en karta med genomsnittspriset för varje bränsletyp bland de
     * angivna bilarna. Priserna grupperas efter bränsletyp, och ett genomsnittspris beräknas
     * för varje grupp.
     *
     * @param bilar En lista av {@code Bil}-objekt vars genomsnittspriser ska beräknas.
     * @return En karta där nycklarna är bränsletyper och värdena är det beräknade genomsnittspriset för varje typ.
     */
    public Map<String, Double> calculateAveragePriceByFuelType(List<Bil> bilar) {
        return bilar.stream()
                .collect(Collectors.groupingBy(Bil::getBransletyp,
                        Collectors.averagingDouble(Bil::getNybilspris)));
    }
}
