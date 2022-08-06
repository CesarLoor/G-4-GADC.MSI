
package espe.edu.ec.CoopLatina.model;

/**
 *
 * @author Loor Cesar, David Montufar,DDCO-ESPE,GADC.MSI
 */
public class Passage {
    private boolean payment;
    private float price;

    public Passage(boolean payment, float price) {
        this.payment = payment;
        this.price = price;
    }

    /**
     * @return the payment
     */
    public boolean isPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
