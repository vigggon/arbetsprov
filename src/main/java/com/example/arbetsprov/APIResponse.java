package com.example.arbetsprov;
import java.util.*;

/**
 * Klassen {@code APIResponse} representerar ett generellt svar från ett API,
 * innehållande pagineringsinformation samt en lista av entiteter av typen {@code Bil}.
 * Denna klass används för att kapsla in den struktur som vanligtvis returneras av REST API:er,
 * särskilt de som stödjer paginering av resultat.
 */
public class APIResponse {
    /** Länken till nästa uppsättning av resultat i pagineringssammanhang. */
    private String next;

    /** Det totala antalet resultat som är tillgängliga över alla sidor. */
    private int resultCount;

    /** Den nuvarande offseten använd för paginering, indikerar startpunkten för de returnerade resultaten. */
    private int offset;

    /** Gränsen för antalet resultat som returneras per sida. */
    private int limit;

    /** Tiden det tog för API:et att svara på förfrågan, uttryckt i millisekunder. */
    private int queryTime;

    /** En lista av {@code Bil}-objekt som representerar de faktiska resultaten från API-anropet. */
    private List<Bil> results;

    /**
     * Skapar en tom instans av {@code APIResponse}.
     */
    public APIResponse() {
    }

    /**
     * Skapar en ny instans av {@code APIResponse} med specifika värden för alla attribut.
     *
     * @param next        Länken till nästa sida av resultat.
     * @param resultCount Det totala antalet resultat som är tillgängliga.
     * @param offset      Den nuvarande offseten för paginering.
     * @param limit       Gränsen för antalet resultat per sida.
     * @param queryTime   Tiden det tog för API:et att svara, uttryckt i millisekunder.
     * @param results     En lista av {@code Bil}-objekt som representerar resultaten från API-anropet.
     */
    public APIResponse(String next, int resultCount, int offset, int limit, int queryTime, List<Bil> results) {
        this.next = next;
        this.resultCount = resultCount;
        this.offset = offset;
        this.limit = limit;
        this.queryTime = queryTime;
        this.results = results;
    }

    // Getter- och setter-metoder

    /**
     * Hämtar länken till nästa sida av resultat.
     *
     * @return En sträng som representerar URL:en till nästa sida av resultat.
     */
    public String getNext() {
        return next;
    }

    /**
     * Sätter länken till nästa sida av resultat.
     *
     * @param next En sträng som representerar URL:en till nästa sida av resultat.
     */
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * Hämtar det totala antalet resultat som är tillgängliga.
     *
     * @return Det totala antalet resultat som är tillgängliga över alla sidor.
     */
    public int getResultCount() {
        return resultCount;
    }

    /**
     * Sätter det totala antalet resultat som är tillgängliga.
     *
     * @param resultCount Det totala antalet resultat.
     */
    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    /**
     * Hämtar den nuvarande offseten för paginering.
     *
     * @return Den nuvarande offseten.
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sätter den nuvarande offseten för paginering.
     *
     * @param offset Den nuvarande offseten.
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     * Hämtar gränsen för antalet resultat per sida.
     *
     * @return Gränsen för antalet resultat per sida.
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sätter gränsen för antalet resultat per sida.
     *
     * @param limit Gränsen för antalet resultat per sida.
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * Hämtar tiden det tog för API:et att svara på förfrågan.
     *
     * @return Svarstiden från API:et, uttryckt i millisekunder.
     */
    public int getQueryTime() {
        return queryTime;
    }

    /**
     * Sätter tiden det tog för API:et att svara på förfrågan.
     *
     * @param queryTime Svarstiden, uttryckt i millisekunder.
     */
    public void setQueryTime(int queryTime) {
        this.queryTime = queryTime;
    }

    /**
     * Hämtar en lista av {@code Bil}-objekt som representerar de faktiska resultaten.
     *
     * @return En lista av {@code Bil}-objekt.
     */
    public List<Bil> getResults() {
        return results;
    }

    /**
     * Sätter listan av {@code Bil}-objekt som representerar de faktiska resultaten.
     *
     * @param results En lista av {@code Bil}-objekt.
     */
    public void setResults(List<Bil> results) {
        this.results = results;
    }
}
