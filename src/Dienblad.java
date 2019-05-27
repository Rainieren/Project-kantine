import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Dienblad {
    private Stack<Artikel> artikelen;
    private int totaalprijs;
    private Persoon klant;

    /**
     * Constructor
     */
    public Dienblad() {
        // method body omitted
    }

    public Dienblad(Persoon klant) {

        this.klant = klant;
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param artikel
     */
    public void voegToe(Artikel artikel) {
        artikelen.add(artikel);
    }

    /**
     * Methode om aantal artikelen op dienblad te tellen
     *
     * @return Het aantal artikelen
     */
    public int getAantalArtikelen() {
        return artikelen.size();
    }

    /**
     * Methode om de totaalprijs van de artikelen
     * op dienblad uit te rekenen
     *
     * @return De totaalprijs
     */
    public double getTotaalPrijs() {
        for(Artikel artikel : artikelen) {
            totaalprijs += artikel.getPrice();
        }
        return totaalprijs;
    }

    public void setKlant(){
        this.klant = klant;
    }

    public Persoon getKlant(){
        return klant;
    }
}

