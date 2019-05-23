import java.math.BigDecimal;

/**
 * @version 1.0
 * @author Rainier
 */
public class Artikel {

    // Initialsing string name and price of the product.
    private String name;
    private int price;

    /**
     *
     * @param name Name of the product
     * @param price Price of the product
     */
    public Artikel(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Artikel() {

    }

    public String toString() {
        return "Artikel: " + name + " Prijs: €" + price;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     *
     * @param name Name of the product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param price Price of the product
     */
    public void setPrice(int price) {
        this.price = price;
    }

}
