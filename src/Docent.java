public class Docent extends Persoon implements KortingskaartHouder {

    private String afkorting;
    private String afdeling;



    /**
     * Constructor
     *
     * @param bsn
     * @param voornaam
     * @param achternaam
     * @param geboortedatum
     * @param geslacht
     * @param afkorting
     * @param afdeling
     */
    public Docent(int bsn, String voornaam, String achternaam, Datum geboortedatum, char geslacht, String afkorting, String afdeling) {
        super(bsn, voornaam, achternaam, geboortedatum, geslacht);
        setAfkorting(afkorting);
        setAfdeling(afdeling);
    }


    /**
     * Set afkorting
     * @param afkorting*/
    public void setAfkorting(String afkorting){
        this.afkorting = afkorting;
    }

    /**
     * Set afdeling
     * @param afdeling */

    public void setAfdeling(String afdeling){
        this.afdeling = afdeling;
    }

    /**
     * get afkorting
     * @return afkorting*/

    public String getAfkorting(){
        return afkorting;
    }

    /**
     * get afdeling
     * @return afdeling*/
    public String getAfdeling(){
        return afdeling;
    }

    /**
     * Geeft het kortingspercentage voor docenten.
     * @return 25%.
     */
    public double geefKortingsPercentage() {
        return 0.25;
    }

    /**
     * Geeft aan dat de kortingskaart een maximum heeft.
     * @return true
     */
    public boolean heeftMaximum() {
        return true;
    }

    /**
     * Geeft het maximale kortingsbedrag van deze kaart per bezoek
     * @return 1 euro.
     */
    public double geefMaximum() {
        return 1.00;
    }


    public String toString(){
        return super.toString() + "Docent[afkorting=" + this.getAfkorting() + ", " + "afdeling=" + this.getAfdeling() + "]";
    }
}
