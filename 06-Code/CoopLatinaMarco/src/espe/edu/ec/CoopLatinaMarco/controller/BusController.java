
package espe.edu.ec.CoopLatinaMarco.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import espe.edu.ec.CoopLatinaMarco.model.Bus;
import org.bson.Document;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class BusController {
    String collection;

    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;
        String uri = "mongodb+srv://Steven1:Steven1@cluster0.izbkb5m.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Successful connection");

        userdatabase = client.getDatabase("CoopLatina");
        return userdatabase;
    }
    public void CreateRoute(Bus buses) {

        MongoDatabase userDB;
        MongoCollection userCollection;
        Document document;
        
        userDB = EstablishConnection();
        userCollection = userDB.getCollection("Bus");

        document = new Document();
        
        document.append("Id", buses.getId());
        document.append("Matricule", buses.getMatricule());
        document.append("Name Of Driver", buses.getNameOfDriver());
        document.append("Route", buses.getRoute());
        

        userCollection.insertOne(document);

    }
     MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;
        String uri = "mongodb+srv://Steven1:Steven1@cluster0.izbkb5m.mongodb.net/?retryWrites=true&w=majority";

        
}

   
    
