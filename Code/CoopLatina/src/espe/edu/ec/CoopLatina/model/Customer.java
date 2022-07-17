
package espe.edu.ec.CoopLatina.model;

/**
 *
 * @author Loor Cesar,David Montufar,DDCO-ESPE,GADC.MSI
 */
public class Customer {
    private String name;
    private String identificationCard;
    private String Password; 
    private int number;

    public Customer(String name, String identificationCard, String Password, int number) {
        this.name = name;
        this.identificationCard = identificationCard;
        this.Password = Password;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", identificationCard=" + identificationCard + ", Password=" + Password + ", number=" + number + '}';
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
     * @return the identificationCard
     */
    public String getIdentificationCard() {
        return identificationCard;
    }

    /**
     * @param identificationCard the identificationCard to set
     */
    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
}
