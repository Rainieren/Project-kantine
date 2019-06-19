public class Kantinemedewerker extends Persoon {

    private int medewerkersNummer;
    private boolean magKassa;


    /**
     * Constructor
     *
     * @param bsn
     * @param voornaam
     * @param achternaam
     * @param geboortedatum
     * @param geslacht
     * @param medewerkersNummer
     * @param magKassa
     */


    public Kantinemedewerker(int bsn, String voornaam, String achternaam, Datum geboortedatum, char geslacht, int medewerkersNummer, boolean magKassa ) {
        super(bsn, voornaam, achternaam, geboortedatum, geslacht);
        setMedewerkersNummer(medewerkersNummer);
        setMagKassa(magKassa);
    }




    /**
     * Set mederwerkersnummer
     * @param medewerkersNummer
     * */

    public void setMedewerkersNummer(int medewerkersNummer){
        this.medewerkersNummer = medewerkersNummer;
    }

    /**
     * Set magKassa
     * @param magKassa
     * */

    public void setMagKassa(boolean magKassa){
      this.magKassa = magKassa;
    }

    /**
     * Get medewerkersNummer
     * @return medewerkersNummer
     * */

    public int getMedewerkersNummer(){
        return medewerkersNummer;
    }

    /**
     * Get magKassa
     * @return magKassa*/

    public boolean getMagKassa(){
        return magKassa;
    }


    public String toString() {
        return super.toString() + "KantineMedewerker[medewerkersnummer=" + this.getMedewerkersNummer() + ", " + "magKassa=" + this.getMagKassa() + "]";
    }
}
