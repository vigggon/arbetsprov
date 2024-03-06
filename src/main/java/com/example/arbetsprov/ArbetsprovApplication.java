package com.example.arbetsprov;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.*;

/**
 * Huvudklass för Spring Boot-applikationen ArbetsprovApplication.
 * Denna applikation är ett arbetsprov som demonstrerar hur man kan hämta
 * och bearbeta data från en extern API.
 *
 * Applikationen hämtar data om bilar från en extern API, beräknar genomsnittliga priser
 * baserat på bränsletyp och skriver ut denna information till konsolen.
 */
@SpringBootApplication
public class ArbetsprovApplication {

	/**
	 * Huvudmetoden som startar Spring Boot-applikationen.
	 *
	 * @param args Argument som kan skickas till applikationen vid start.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ArbetsprovApplication.class, args);
	}

	/**
	 * Definierar en CommandLineRunner bean som utför logik vid applikationens start.
	 * Denna metod använder BilService för att hämta en lista av bilar från en extern API,
	 * beräknar genomsnittspriset för varje bränsletyp och skriver ut denna information.
	 *
	 * @param bilService BilService som används för att interagera med den externa API:n.
	 * @return En CommandLineRunner som utför önskad logik vid applikationens start.
	 */
	@Bean
	public CommandLineRunner run(BilService bilService) {
		return args -> {
			String apiUrl = "https://skatteverket.entryscape.net/rowstore/dataset/fad86bf9-67e3-4d68-829c-7b9a23bc5e42";
			List<Bil> bilar = bilService.getBilar(apiUrl);

			if (!bilar.isEmpty()) {
				Map<String, Double> averagePriceByFuelType = bilService.calculateAveragePriceByFuelType(bilar);

				averagePriceByFuelType.forEach((fuelType, averagePrice) ->
						System.out.println("Bränsletyp: " + fuelType + ", Genomsnittligt pris: " + averagePrice));
			} else {
				System.out.println("Inga bilar hämtades från API:et.");
			}
		};
	}

}

