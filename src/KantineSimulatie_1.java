public class KantineSimulatie {

    private Kantine kantine;

    public static final int DAGEN = 7;

    /**
     * Constructor
     */
    public KantineSimulatie() {

        kantine = new Kantine();
    }

    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine
     *
     * @param dagen
     */
    public void simuleer(int dagen) {

        // herhaal voor elke dag
        for(int i = 0; i<=7; i++) {

            // per dag nu even vast 10 + i personen naar binnen
            // laten gaan, wordt volgende week veranderd...

            // for lus voor personen
            for(int j = 0; j < 10 + i; j++){
                // kantine.(...);
            }

            // verwerk rij voor de kassa
            Kantine.verwerkRijVoorKassa();
            // toon dagtotalen (artikelen en geld in kassa)
            Kantine.hoeveelheidGeldInKassa();
            // reset de kassa voor de volgende dag
            Kantine.resetKassa();
        }
    }

    /**
     * Start een simulatie
     */
    public static void main(String[] args) {
        int dagen;

        if (args.length == 0) {
            dagen = DAGEN;
        } else {
            dagen = Integer.parseInt(args[0]);
        }

        simuleer(dagen);
    }
}