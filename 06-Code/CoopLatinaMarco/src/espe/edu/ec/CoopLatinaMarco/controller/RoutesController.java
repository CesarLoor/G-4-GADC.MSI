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

    public RoutesController(Route object, String CollectionName){
        super(object,CollectionName);
    }
}

