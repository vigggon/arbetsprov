package com.example.arbetsprov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Konfigurationsklass för att skapa Spring-hanterade beans relaterade till HTTP-kommunikation.
 * Denna klass är annoterad med {@code @Configuration}, vilket indikerar att den är en källa
 * till bean-definitioner.
 */
@Configuration
public class RestTemplateConfig {

    /**
     * Skapar en {@link RestTemplate}-bean som kan användas för att utföra HTTP-förfrågningar.
     * {@link RestTemplate} är en synkron klient för att utföra HTTP-förfrågningar och exponerar
     * ett enkelt, mallbaserat API över underliggande HTTP-klientbibliotek såsom JDK:s
     * HttpURLConnection, Apache HttpComponents och andra.
     *
     * @return En ny instans av {@link RestTemplate}.
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
