
package espe.edu.ec.CoopLatinaMarco.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.bson.Document;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Passenger  extends BasicModel{
    
    private int identificationCard;
    private String name;
    private String email;

    
    
    public Passenger(){}
    
    @Override
        public Document buildDocument() {
        Document document = new Document();

        document.append("id", this.identificationCard).
                append("name", this.name).
                append("email", this.email);

        return document;
    }
       

    public Passenger(int id, String name, String email) {
        this.identificationCard = id;
        this.name = name;
        this.email = email;
    }
//     public void see(){
//        List<Passenger> passenger;
//        passenger = new ArrayList<>();
//        
//        
//        Set<String> names;
//        names = new TreeSet<>();
//        }

    @Override
    public String toString() {
        return "Passenger{" + "id=" + getIdentificationCard() + ", name=" + getName() + ", email=" + getEmail() + '}';
        
    }
    
   

    /**
     * @return the identificationCard
     */
    public int getIdentificationCard() {
        return identificationCard;
    }

    /**
     * @param identificationCard the identificationCard to set
     */
    public void setIdentificationCard(int identificationCard) {
        this.identificationCard = identificationCard;
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
    
    
    
    
    

    
}
