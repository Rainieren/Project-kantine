import java.lang.reflect.GenericArrayType;

public class Persoon {

    private int BurgerServiceNummer;
    private String voornaam;
    private String achternaam;
    private Datum geboortedatum;
    private char geslacht;

    public Persoon(int BurgerServiceNummer, String voornaam, Datum geboortedatum, char geslacht) {
        checkGeslacht(geslacht);
    }

    // Opdracht 3. C (Laatste dot) nog onduidelijk.
    public Persoon() {
        Datum geboortedatum = null;
        char geslacht = '0';
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
        return "BSN: " + BurgerServiceNummer + " , " + voornaam + " " + achternaam + " Geboortedatum: " + geboortedatum + " geslacht: " + geslacht;
    }


    /**
     *
     * @return
     */
    public String getGeboortedatum() {

        return Datum.getDatumAsString();
    }

    /**
     *
     * @return
     */
    public int getBurgerServiceNummer() {
        return BurgerServiceNummer;
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
        this.BurgerServiceNummer = burgerServiceNummer;
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
     *
     * @param voornaam
     */
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
}
