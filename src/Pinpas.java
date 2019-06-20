public class Pinpas extends Betaalwijze {

    private double kredietlimiet;

    /**
     * Methode om kredietlimiet te zetten
     * @param kredietlimiet
     */
    public void setKredietLimiet(double kredietlimiet) {
        this.kredietlimiet = kredietlimiet;
    }

    /**
     * Methode om betaling af te handelen
     */
    public boolean betaald(double tebetalen, Persoon klant) throws TeWeinigGeldException {
        if (saldo - tebetalen < this.kredietlimiet) {
            throw new TeWeinigGeldException(klant.getVoornaam() + " " + klant.getVoornaam() + " heeft te weinig geld.");
        }
        this.kredietlimiet -= tebetalen;
        this.saldo -= tebetalen;
        return true;
    }
}
