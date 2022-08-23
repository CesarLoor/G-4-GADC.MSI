package espe.edu.ec.CoopLatinaMarco.controller;

//import com.mongodb.MongoClient;
//import com.mongodb.MongoClientURI;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
import espe.edu.ec.CoopLatinaMarco.model.Route;
//import org.bson.Document;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class RoutesController extends BasicController<Route>{
<<<<<<< HEAD
    public RoutesController(Route object, String CollectionName){
        super(object,CollectionName);
    }
}
=======
    
//       String collection;
//       MongoDatabase routeDB;
//       MongoCollection routeCollection;
//       Document document;

    public RoutesController(Route object, String CollectionName) {
        super(object, CollectionName);
    }

//    public MongoDatabase EstablishConnection() {
//        MongoClientURI clientURI;
//        MongoClient client;
//        MongoDatabase userdatabase;
//        String uri = "mongodb+srv://Steven1:Steven1@cluster0.izbkb5m.mongodb.net/?retryWrites=true&w=majority";
//
//        clientURI = new MongoClientURI(uri);
//        client = new MongoClient(clientURI);
//        System.out.println("Successful connection");
//
//        userdatabase = client.getDatabase("CoopLatina");
//        return userdatabase;
//    }
//    public void CreateRoute(Route routes) {
//        
//        routeDB = EstablishConnection();
//        routeCollection = routeDB.getCollection("Routes");
//
//        document = new Document();
//        
//        document.append("Name Route", routes.getNameRoute());
//        document.append("Id Route", routes.getIdRoute());
//        document.append("Distance KM", routes.getDistanceKm());
//        document.append("price of route", routes.getPriceOfRoute());
//        document.append("avaible routes", routes.isAvalibleRoute());
//
//        routeCollection.insertOne(document);
//
//    }
//
//    public void CreateRoute() {
//      
//    }
}
>>>>>>> e04ef2aa0f88b76115d1acd6925bb7dcd229fbb5
