/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.Iterator;
import org.bson.BSONObject;
import org.bson.Document;

/**
 *
 * @author Jimmy Simbaña <your.name at your.org>
 */
public class Conection {

     MongoDatabase dataBase;
    //DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    MongoCollection<Document> collection;
    MongoClient mongo;
    String nameCollection;

    Gson gson = new Gson();

    public Conection(String nameCollection) {
        try {
            this.nameCollection = nameCollection;
            String data;
            data = "mongodb+srv://rrssDevelopers:hotelAPS@cluster0.oqpo1.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
            MongoClientURI uri;
            uri = new MongoClientURI(data);
            mongo = new MongoClient(uri);
            dataBase = mongo.getDatabase("hotel");

            collection = dataBase.getCollection(nameCollection);
            System.out.println("conection to database is sucessfully");

        } catch (Exception e) {
            System.out.println("no tiene acceso a la base de datos");

        }
    }

    public void save(Customer customer) {

        BSONObject bson;
        Document admin;
        admin = new Document("name", customer.getName());
        admin.append("id", customer.getId());
        admin.append("documentNumber", customer.getDocumentNumber());
        admin.append("Telephone", customer.getTelephone());
        admin.append("Email", customer.getEmail());
        collection.insertOne(admin);
        mongo.close();

    }
    
    public Customer retrieveCustomer(String username, String password) {
        Customer customer;
        MongoCursor<Document> searchDocument = collection.find().iterator();
        String name;
        String id;
        String documentNumber;
        String telephone;
        String email;

        Customer customerRetrieved = new Customer("name", " id","documentNumber", "telephone", "email");
        while (searchDocument.hasNext()) {
            Document theObj = searchDocument.next();
            name = gson.toJson(theObj.get("name")).replace("\"", "");
            id = gson.toJson(theObj.get("id")).replace("\"", "");
            documentNumber = gson.toJson(theObj.get("documentNumber")).replace("\"", "");
            telephone = gson.toJson(theObj.get("telephone")).replace("\"", "");
            email = gson.toJson(theObj.get("email")).replace("\"", "");
            customer = new Customer(name,id,documentNumber,telephone,email);

            if (username.contentEquals(customer.getName())&& password.contentEquals(customer.getTelephone())) {
                customerRetrieved = customer;
            }

        }
        return customerRetrieved;

    }
    
    public Customer retrieveNameCustomer(String username) {
        Customer customer;
        MongoCursor<Document> searchDocument = collection.find().iterator();
        String name,id,documentNumber,telephone,email;

        Customer customerRetrieved = new Customer("name", " id","documentNumber", "telephone", "email");
        while (searchDocument.hasNext()) {
            Document theObj = searchDocument.next();
            name = gson.toJson(theObj.get("name")).replace("\"", "");
            id = gson.toJson(theObj.get("id")).replace("\"", "");
            documentNumber = gson.toJson(theObj.get("documentNumber")).replace("\"", "");
            telephone = gson.toJson(theObj.get("telephone")).replace("\"", "");
            email = gson.toJson(theObj.get("email")).replace("\"", "");
            customer = new Customer(name,id,documentNumber,telephone,email);

            if (username.contentEquals(customer.getName())) {
                customerRetrieved = customer;
            }

        }
        return customerRetrieved;

    }
    /*MongoCollection<Document> collection;
    private String cluster;
    private MongoClientURI uri;
    private MongoClient mongoClient;
    private DB database;
    //private DBCollection collection;

    public Conection(String dBname, String collectionName) {
        cluster =  "mongodb+srv://rrssDevelopers:hotelAPS@cluster0.oqpo1.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
        uri = new MongoClientURI(cluster);
        mongoClient = new MongoClient(uri);
        database = mongoClient.getDB(dBname);
        collection = database.getCollection("customer");
    }*/

}

