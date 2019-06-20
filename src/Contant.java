public class Contant extends Betaalwijze {
    /**
     * Methode om betaling af te handelen
     */

    public boolean betaald(double tebetalen, Persoon klant) throws TeWeinigGeldException {
        if (tebetalen > this.saldo) {
            throw new TeWeinigGeldException(klant.getVoornaam() + " " + klant.getVoornaam() + " heeft te weinig geld.");
        }
    return true;

    /*

        1. Beide betaalwijzen zou je een tegoed kunnen opslaan
        2. Betaling met een pinpas gebeurt vanaf een rekening waar een kredietlimiet opzit.
        3. Kredietlimiet bestaat niet voor contant. Alleen als je cash op is.
     */
}
}