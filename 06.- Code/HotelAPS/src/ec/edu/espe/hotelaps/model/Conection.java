/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Jimmy Simbaña <your.name at your.org>
 */

public class Conection {
    String cluster;
    MongoClientURI uri;
    MongoClient client;
    MongoDatabase db;
    MongoCollection collection;
    
    //Coneccion a la Base de datos MongoDb

    public Conection(String Dbname, String Collectionname) {
        cluster =  "mongodb+srv://jasimbana14:1715141188ipa@cluster0.uk6pr.mongodb.net/Database?retryWrites=true&w=majority";
        uri = new MongoClientURI(cluster);
        client = new MongoClient(uri);
        db = client.getDatabase(Dbname);
        collection = db.getCollection(Collectionname);
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public MongoClientURI getUri() {
        return uri;
    }

    public void setUri(MongoClientURI uri) {
        this.uri = uri;
    }

    public MongoClient getClient() {
        return client;
    }

    public void setClient(MongoClient client) {
        this.client = client;
    }

    public MongoDatabase getDb() {
        return db;
    }

    public void setDb(MongoDatabase db) {
        this.db = db;
    }

    public MongoCollection getCollection() {
        return collection;
    }

    public void setCollection(MongoCollection collection) {
        this.collection = collection;
    }
    
   
    
}