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
        Artikel banaan = new Artikel();
        Artikel cola = new Artikel();
        dienblad.voegToe(banaan);
        dienblad.voegToe(cola);
        KassaRij.sluitAchteraan();
    }

    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() {
        while(KassaRij.erIsEenRij();) {
            // omitted
        }
    }


    public Kassa getKassa(){
        return kassa;
    }

    public void setKantineAanbod(){
        this.kantineAanbod = kantineAanbod;
    }

    public KantineAanbod getKantineAanbod() {
        return kantineAanbod;
    }
}