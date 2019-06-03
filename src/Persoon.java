import java.lang.reflect.GenericArrayType;

public class Persoon {

    private int burgerServiceNummer;
    private String voornaam;
    private String achternaam;
    private Datum geboortedatum;
    private char geslacht;

    private Dienblad dienblad;

    public Persoon(int burgerServiceNummer, String voornaam, String achternaam, Datum geboortedatum, char geslacht) {
        this();
        checkGeslacht(geslacht);
    }

    // Opdracht 3. C (Laatste dot) nog onduidelijk.
    public Persoon() {
        geboortedatum = null;
        geslacht = '0';
        voornaam = "Onbekend";
        achternaam = "Onbekend";
        burgerServiceNummer = 0;
    }

    /**
     * Opdracht 3. C
     * @return
     */
    public String getGeslacht() {
        return checkGeslacht(geslacht);
    }

    public String checkGeslacht(char geslacht) {
        switch (geslacht) {
            case 'M':
                return "Man";
            case 'V':
                return "Vrouw";
            default:
                return "Onbekend";
        }
    }

    public String toString() {
        return "BSN: " + burgerServiceNummer + " , " + voornaam + " " + achternaam + " Geboortedatum: " + geboortedatum + " geslacht: " + geslacht;
    }


    /**
     *
     * @return
     */
    public String getGeboortedatum() {

        return geboortedatum.getDatumAsString();
    }

    /**
     *
     * @return
     */
    public int getBurgerServiceNummer() {
        return burgerServiceNummer;
    }

    /**
     *
     * @return
     */
    public String getAchternaam() {
        return achternaam;
    }

    /**
     *
     * @return
     */
    public String getVoornaam() {
        return voornaam;
    }

    /**
     *
     * @param achternaam
     */
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    /**
     *
     * @param burgerServiceNummer
     */
    public void setBurgerServiceNummer(int burgerServiceNummer) {
        this.burgerServiceNummer = burgerServiceNummer;
    }

    /**
     *
     * @param geboortedatum
     */
    public void setGeboortedatum(Datum geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    /**
     *
     * @param geslacht
     */
    public void setGeslacht(char geslacht) {

        // Beveiliging checkend of input M of V is.
        if(!(geslacht == 'M' || geslacht == 'V')) {
            System.out.println("Het geslacht moet M of V zijn." + "\n" + "Probeer opnieuw");
        } else {
            this.geslacht = geslacht;
        }

    }

    /**
     * Methode om dienblad te koppelen aan een persoon
     *
     * @param dienblad
     */
    public void pakDienblad(Dienblad dienblad){
        this.dienblad = dienblad;
    }


    /**
     *
     * @param voornaam
     */
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
}
