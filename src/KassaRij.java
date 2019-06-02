import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KassaRij {

    private Queue<Dienblad> klanten;
    private LinkedList<Persoon> klant;
    /**
     * Constructor
     */
    public KassaRij() {

        this.klanten = new LinkedList<>();
        this.klant = new LinkedList<Persoon>();
    }



    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant
     */
    public void sluitAchteraan(Dienblad klant) {

        this.klanten.add(klant);
    }

    /**
     * Indien er een rij bestaat, de eerste klant uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     *
     * @return Eerste klant in de rij of null
     */
    public Dienblad eerstePersoonInRij() {
        // method body omitted
        return klanten.peek();

    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {

        if(!klanten.isEmpty()) {
            return true;
        }

        return false;
    }
}