/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Jimmy Simbaña <your.name at your.org>
 */
public class Conection {

    private String cluster;
    private MongoClientURI uri;
    private MongoClient mongoClient;
    private DB database;
    private DBCollection collection;

    public Conection(String Dbname, String Collectionname) {
        cluster =  "mongodb+srv://jasimbana14:1715141188ipa@cluster0.uk6pr.mongodb.net/Database?retryWrites=true&w=majority";
        uri = new MongoClientURI(cluster);
        mongoClient = new MongoClient(uri);
        database = mongoClient.getDB(Dbname);
        collection = database.getCollection(Collectionname);
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

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public DB getDatabase() {
        return database;
    }

    public void setDatabase(DB database) {
        this.database = database;
    }

    public DBCollection getCollection() {
        return collection;
    }

    public void setCollection(DBCollection collection) {
        this.collection = collection;
    }
    
}

