public class Docent extends Persoon {

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
     * @param studentNummer
     * @param studieRichting
     */
    public Docent(int bsn, String voornaam, String achternaam, Datum geboortedatum, char geslacht, int studentNummer, String studieRichting) {
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


    public String toString(){
        return super.toString() + "Docent[afkorting=" + this.getAfkorting() + ", " + "afdeling=" + this.getAfdeling() + "]";
    }
}
