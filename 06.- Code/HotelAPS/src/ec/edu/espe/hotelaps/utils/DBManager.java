/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.utils;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author SSS SANTIAGO
 */
public class DBManager implements NOSQLDBManager {
    MongoDatabase dataBase;
    BasicDBObject document = new BasicDBObject();
    MongoCollection<Document> collection;
    MongoClient mongo;
    String nameCollection;
    Gson gson = new Gson();
    public void connection (String nameCollection){
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

    @Override
    public boolean save(Document data) {
        collection.insertOne(data);
        mongo.close();
        return true;
    }

   public boolean retrived(String data, String key) {

        boolean verify = false;
        MongoCursor<Document> searchDocument = collection.find().iterator();
        String id;
        while (searchDocument.hasNext()) {
            Document theObj = searchDocument.next();
            id = theObj.getString(key);
            
            
            if (data.equals(id)) {
                verify = true;
            }

        }

        return verify;

    }
    
   public boolean delete (String name, String key){

        Document findDocument = new Document(key, name);
        collection.findOneAndDelete(findDocument);
        return true; 
   }
   
   public void update(String numberRoom){
             Document findDocument = new Document("number",numberRoom);
             Document updateDocument = new Document("$set", new Document("status", "Deshabilitado"));
             collection.findOneAndUpdate(findDocument, updateDocument);
   }
}

    
  
