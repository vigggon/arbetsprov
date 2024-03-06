package com.example.arbetsprov;

/**
 * Klassen {@code Bil} modellerar information om en bil som inkluderar detaljer
 * som fordonstyp, kod, skapandedatum, tillverkningsår, märke, modell, och nybilspris,
 * bland annat. Denna klass används för att representera och hantera bilinformation
 * erhållen från ett externt API.
 */
public class Bil {
    // Fältdefinitioner
    private String fordonstyp;
    private String kod;
    private String filskapaddatum;
    private int tillverkningsar;
    private String kodforjamforbarmodell;
    private String marke;
    private double nybilspris;
    private String modell;
    private String bransletyp;
    private String vardeefterschablon;
    private String justering;

    /**
     * Standardkonstruktor som skapar en tom instans av {@code Bil}.
     */
    public Bil() {
    }

    /**
     * Konstruktor som initialiserar en ny instans av {@code Bil} med specifika attribut.
     *
     * @param fordonstyp Typ av fordon.
     * @param kod En unik identifierare för bilen.
     * @param filskapsdatum Datum då bilinformationen skapades eller uppdaterades senast.
     * @param tillverkningsar Året då bilen tillverkades.
     * @param kodforjamforbarmodell Kod för att jämföra bilmodeller.
     * @param marke Märket på bilen.
     * @param nybilspris Priset på bilen vid nyköp.
     * @param modell Modellen av bilen.
     * @param bransletyp Typen av bränsle bilen använder.
     * @param vardeefterschablon Schablonmässigt värde för bilen.
     * @param justering Eventuella justeringar av bilens värde.
     */
    public Bil(String fordonstyp, String kod, String filskapsdatum, int tillverkningsar, String kodforjamforbarmodell,
               String marke, double nybilspris, String modell, String bransletyp, String vardeefterschablon, String justering) {
        this.fordonstyp = fordonstyp;
        this.kod = kod;
        this.filskapaddatum = filskapsdatum;
        this.tillverkningsar = tillverkningsar;
        this.kodforjamforbarmodell = kodforjamforbarmodell;
        this.marke = marke;
        this.nybilspris = nybilspris;
        this.modell = modell;
        this.bransletyp = bransletyp;
        this.vardeefterschablon = vardeefterschablon;
        this.justering = justering;
    }

    /**
     * Hämtar fordonstypen för denna bil.
     *
     * @return Fordonstypen som en sträng.
     */
    public String getFordonstyp() {
        return fordonstyp;
    }

    /**
     * Sätter fordonstypen för denna bil.
     *
     * @param fordonstyp Den nya fordonstypen som en sträng.
     */
    public void setFordonstyp(String fordonstyp) {
        this.fordonstyp = fordonstyp;
    }

    /**
     * Hämtar den unika koden för denna bil.
     *
     * @return Bilkoden som en sträng.
     */
    public String getKod() {
        return kod;
    }

    /**
     * Sätter den unika koden för denna bil.
     *
     * @param kod Den nya bilkoden som en sträng.
     */
    public void setKod(String kod) {
        this.kod = kod;
    }

    /**
     * Hämtar skapandedatumet för bilinformationen.
     *
     * @return Skapandedatumet som en sträng.
     */
    public String getFilskapaddatum() {
        return filskapaddatum;
    }

    /**
     * Sätter skapandedatumet för bilinformationen.
     *
     * @param filskapaddatum Det nya skapandedatumet som en sträng.
     */
    public void setFilskapaddatum(String filskapaddatum) {
        this.filskapaddatum = filskapaddatum;
    }

    /**
     * Hämtar tillverkningsåret för bilen.
     *
     * @return Tillverkningsåret som ett heltal.
     */
    public int getTillverkningsar() {
        return tillverkningsar;
    }

    /**
     * Sätter tillverkningsåret för bilen.
     *
     * @param tillverkningsar Det nya tillverkningsåret som ett heltal.
     */
    public void setTillverkningsar(int tillverkningsar) {
        this.tillverkningsar = tillverkningsar;
    }

    /**
     * Hämtar jämförelsekoden för bilmodellen.
     *
     * @return Jämförelsekoden som en sträng.
     */
    public String getKodforjamforbarmodell() {
        return kodforjamforbarmodell;
    }

    /**
     * Sätter jämförelsekoden för bilmodellen.
     *
     * @param kodforjamforbarmodell Den nya jämförelsekoden som en sträng.
     */
    public void setKodforjamforbarmodell(String kodforjamforbarmodell) {
        this.kodforjamforbarmodell = kodforjamforbarmodell;
    }

    /**
     * Hämtar märket på bilen.
     *
     * @return Märket som en sträng.
     */
    public String getMarke() {
        return marke;
    }

    /**
     * Sätter märket på bilen.
     *
     * @param marke Det nya märket som en sträng.
     */
    public void setMarke(String marke) {
        this.marke = marke;
    }

    /**
     * Hämtar nybilspriset för bilen.
     *
     * @return Nybilspriset som ett decimaltal.
     */
    public double getNybilspris() {
        return nybilspris;
    }

    /**
     * Sätter nybilspriset för bilen.
     *
     * @param nybilspris Det nya nybilspriset som ett decimaltal.
     */
    public void setNybilspris(double nybilspris) {
        this.nybilspris = nybilspris;
    }

    /**
     * Hämtar modellen på bilen.
     *
     * @return Modellen som en sträng.
     */
    public String getModell() {
        return modell;
    }

    /**
     * Sätter modellen på bilen.
     *
     * @param modell Den nya modellen som en sträng.
     */
    public void setModell(String modell) {
        this.modell = modell;
    }

    /**
     * Hämtar bränsletypen för bilen.
     *
     * @return Bränsletypen som en sträng.
     */
    public String getBransletyp() {
        return bransletyp;
    }

    /**
     * Sätter bränsletypen för bilen.
     *
     * @param bransletyp Den nya bränsletypen som en sträng.
     */
    public void setBransletyp(String bransletyp) {
        this.bransletyp = bransletyp;
    }

    /**
     * Hämtar schablonvärdet för bilen.
     *
     * @return Schablonvärdet som en sträng.
     */
    public String getVardeefterschablon() {
        return vardeefterschablon;
    }

    /**
     * Sätter schablonvärdet för bilen.
     *
     * @param vardeefterschablon Det nya schablonvärdet som en sträng.
     */
    public void setVardeefterschablon(String vardeefterschablon) {
        this.vardeefterschablon = vardeefterschablon;
    }

    /**
     * Hämtar justeringen för bilens värde.
     *
     * @return Justeringen som en sträng.
     */
    public String getJustering() {
        return justering;
    }

    /**
     * Sätter justeringen för bilens värde.
     *
     * @param justering Den nya justeringen som en sträng.
     */
    public void setJustering(String justering) {
        this.justering = justering;
    }

    /**
     * Överskriver {@code toString}-metoden för att ge en strängrepresentation av {@code Bil}-objektet.
     * Denna metod genererar en sträng som innehåller en detaljerad beskrivning av bilen, inklusive alla dess attribut
     * som fordonstyp, kod, skapandedatum, tillverkningsår, modelljämförelsekod, märke, nybilspris, modell,
     * bränsletyp, schablonvärde och eventuella justeringar. Formatet på den returnerade strängen är utformad
     * för att vara lättläst och informativ, vilket gör det enklare att snabbt få en översikt av bilens egenskaper.
     *
     * @return En sträng som representerar bilobjektet, innehållande värden för alla dess fält.
     */
    @Override
    public String toString() {
        return "Bil{" +
                "fordonstyp='" + fordonstyp + '\'' +
                ", kod='" + kod + '\'' +
                ", filskapaddatum='" + filskapaddatum + '\'' +
                ", tillverkningsar=" + tillverkningsar +
                ", kodforjamforbarmodell='" + kodforjamforbarmodell + '\'' +
                ", marke='" + marke + '\'' +
                ", nybilspris=" + nybilspris +
                ", modell='" + modell + '\'' +
                ", bransletyp='" + bransletyp + '\'' +
                ", vardeefterschablon='" + vardeefterschablon + '\'' +
                ", justering='" + justering + '\'' +
                '}';
    }
}
