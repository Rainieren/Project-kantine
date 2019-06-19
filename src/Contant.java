public class Contant extends Betaalwijze {
    /**
     * Methode om betaling af te handelen
     */
    public boolean betaal(double tebetalen) {
        if (tebetalen <= this.saldo) {
            this.saldo -= tebetalen;
        }
        return true;
    }
}