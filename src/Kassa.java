import java.util.Iterator;

public class Kassa {

    private int totaalGepasseerdeArtikelen;
    private double geldGepasseerd;
    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        // method body omitted
    }

    /**
     * Vraag het aantal artikelen en de totaalprijs op.
     * Tel deze gegevens op bij de controletotalen die voor
     * de kassa worden bijgehouden. De implementatie wordt
     * later vervangen door een echte betaling door de persoon.
     *
     * @param klant die moet afrekenen
     */
    public void rekenAf(Dienblad klant) {
        // method body omitted

        this.totaalGepasseerdeArtikelen += klant.getAantalArtikelen();
        this.geldGepasseerd += klant.getTotaalPrijs();

    }

    /**
     * Geeft het aantal artikelen dat de kassa heeft gepasseerd,
     * vanaf het moment dat de methode resetWaarden is aangeroepen.
     *
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        return totaalGepasseerdeArtikelen;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die de kass
     * zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa is aangeroepen.
     *
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        return geldGepasseerd;

    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() {
        this.totaalGepasseerdeArtikelen = 0;
        this.geldGepasseerd = 0;
    }

}