public class Kantine {

    private Kassa kassa;
    private KassaRij kassarij;
    private KantineAanbod kantineAanbod;

    /**
     * Constructor
     */
    public Kantine() {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }

    /**
     * In deze methode wordt een Persoon en Dienblad gemaakt
     * en aan elkaar gekoppeld. Maak twee Artikelen aan
     * en plaats deze op het dienblad. Tenslotte sluit de
     * Persoon zich aan bij de rij voor de kassa.
     */
    public void loopPakSluitAan() {
        Persoon klant = new Persoon();
        Dienblad dienblad = new Dienblad(klant);
        klant.pakDienblad(dienblad);
        Artikel banaan = new Artikel();
        Artikel cola = new Artikel();
        dienblad.voegToe(banaan);
        dienblad.voegToe(cola);
        kassarij.sluitAchteraan(dienblad);
    }

    /**
     *
     * @param persoon
     * @param artikelnamen
     */
    public void loopPakSluitAan(Persoon persoon, String[] artikelnamen){
        Dienblad dienblad = new Dienblad();
        persoon.pakDienblad(dienblad);
        for(String artikelnaam : artikelnamen){
            dienblad.voegToe(kantineAanbod.getArtikel(artikelnaam));
        }
        this.kassarij.sluitAchteraan(dienblad);
    }

    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() {
        while(kassarij.erIsEenRij()) {
            this.kassa.rekenAf(this.kassarij.eerstePersoonInRij());
        }
    }

    /**
     *
     * @return
     */
    public Kassa getKassa(){
        return this.kassa;
    }

    /**
     *
     */
    public void setKantineAanbod(KantineAanbod kantineAanbod){
        this.kantineAanbod = kantineAanbod;
    }

    /**
     *
     * @return
     */
    public KantineAanbod getKantineAanbod() {
        return this.kantineAanbod;
    }
}