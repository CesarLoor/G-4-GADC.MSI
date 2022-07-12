
package espe.edu.ec.CoopLatina.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Passenger {
    private String name;
    private int numberPassenger;
    private String email;
    private boolean pendinPayment;

    public Passenger(String name, int numberPassenger, String email, boolean pendinPayment) {
        this.name = name;
        this.numberPassenger = numberPassenger;
        this.email = email;
        this.pendinPayment = pendinPayment;
    }

    @Override
    public String toString() {
        return "Passenger{" + "name=" + name + ", numberPassenger=" + numberPassenger + ", email=" + email + ", pendinPayment=" + pendinPayment + '}';
    }

    
    
    
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the numberPassenger
     */
    public int getNumberPassenger() {
        return numberPassenger;
    }

    /**
     * @param numberPassenger the numberPassenger to set
     */
    public void setNumberPassenger(int numberPassenger) {
        this.numberPassenger = numberPassenger;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the pendinPayment
     */
    public boolean isPendinPayment() {
        return pendinPayment;
    }

    /**
     * @param pendinPayment the pendinPayment to set
     */
    public void setPendinPayment(boolean pendinPayment) {
        this.pendinPayment = pendinPayment;
    }
    
    
    
    
}
