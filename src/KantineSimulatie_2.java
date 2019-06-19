import java.util.*;

public class KantineSimulatie_2 {

    // kantine
    private Kantine kantine;

    // kantineaanbod
    private KantineAanbod kantineaanbod;

    // random generator
    private Random random;

    // aantal dagen
    public static final int DAGEN = 7;

    // aantal artikelen
    private static final int AANTAL_ARTIKELEN = 4;

    // artikelen
    private static final String[] artikelnamen = new String[]
        {"Koffie", "Broodje pindakaas", "Broodje kaas", "Appelsap"};

    // prijzen
    private static double[] artikelprijzen = new double[]{1.50, 2.10, 1.65, 1.65};

    // minimum en maximum aantal artikelen per soort
    private static final int MIN_ARTIKELEN_PER_SOORT = 10000;
    private static final int MAX_ARTIKELEN_PER_SOORT = 20000;

    // minimum en maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG = 50;
    private static final int MAX_PERSONEN_PER_DAG = 100;

    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON = 1;
    private static final int MAX_ARTIKELEN_PER_PERSOON = 4;

    /**
     * Constructor
     *
     */
    public KantineSimulatie_2() {
        kantine = new Kantine();
        random = new Random();
        int[] hoeveelheden = getRandomArray(
            AANTAL_ARTIKELEN,
            MIN_ARTIKELEN_PER_SOORT,
            MAX_ARTIKELEN_PER_SOORT);
        kantineaanbod = new KantineAanbod(
            artikelnamen, artikelprijzen, hoeveelheden);

        kantine.setKantineAanbod(kantineaanbod);
    }

    /**
     * Methode om een array van random getallen liggend tussen
     * min en max van de gegeven lengte te genereren
     *
     * @param lengte
     * @param min
     * @param max
     * @return De array met random getallen
     */
    private int[] getRandomArray(int lengte, int min, int max) {
        int[] temp = new int[lengte];
        for(int i = 0; i < lengte ;i++) {
            temp[i] = getRandomValue(min, max);
        }

        return temp;
    }

    /**
     * Methode om een random getal tussen min(incl)
     * en max(incl) te genereren.
     *
     * @param min
     * @param max
     * @return Een random getal
     */
    private int getRandomValue(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Methode om op basis van een array van indexen voor de array
     * artikelnamen de bijhorende array van artikelnamen te maken
     *
     * @param indexen
     * @return De array met artikelnamen
     */
    private String[] geefArtikelNamen(int[] indexen) {
        String[] artikelen = new String[indexen.length];

        for(int i = 0; i < indexen.length; i++) {
            artikelen[i] = artikelnamen[indexen[i]];

        }

        return artikelen;
    }

    /**
     * Deze methode simuleert een aantal dagen
     * in het verloop van de kantine
     *
     * @param dagen
     */
    public void simuleer(int dagen) {
        // for lus voor dagen

        double[] omzetArray;

        for(int i = 0; i < dagen; i++) {

            // bedenk hoeveel personen vandaag binnen lopen
            int aantalpersonen = 100;

            // laat de personen maar komen...
            for(int j = 0; j < aantalpersonen; j++) {
                Persoon persoon;

                int rand = this.getRandomValue(1, aantalpersonen);
                int aantalartikelen = 10 ;
                int[] tepakken = getRandomArray(
                        aantalartikelen, 0, AANTAL_ARTIKELEN-1);
                String[] artikelen = geefArtikelNamen(tepakken);


                if(rand == aantalpersonen) {
                    persoon = new Kantinemedewerker();

                    kantine.loopPakSluitAan(persoon, artikelen);
                    // vind de artikelnamen op basis van
                    // de indexen hierboven

                } else if (rand >= (aantalpersonen - 10)) {
                    persoon = new Docent();

                    kantine.loopPakSluitAan(persoon, artikelen);
                } else {
                    persoon = new Student();

                    kantine.loopPakSluitAan(persoon, artikelen);
                }
                System.out.println("Klant " + (j+1) + ": " + persoon.toString());
            }
            // verwerk rij voor de kassa
            kantine.verwerkRijVoorKassa();
            // toon dagtotalen (artikelen en geld in kassa)
            Kassa kassa = kantine.getKassa();

            System.out.println("-- Dag: " + i + " --");
            System.out.println("Aantal artikelen: " + kassa.aantalArtikelen());
            System.out.println("Geld in de la: " + kassa.hoeveelheidGeldInKassa());

            // reset de kassa voor de volgende dag
            kassa.resetKassa();

        }

        /**
         * Start een simulatie
         */

    }

    public static void main(String[] args) {
        int dagen;

        if (args.length == 0) {
            dagen = DAGEN;
        } else {
            dagen = Integer.parseInt(args[0]);
        }

        KantineSimulatie_2 kantineSimulatie = new KantineSimulatie_2();
        kantineSimulatie.simuleer(dagen);
    }
}