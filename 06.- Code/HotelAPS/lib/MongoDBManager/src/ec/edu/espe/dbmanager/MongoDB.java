/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.dbmanager;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gte;
import static com.mongodb.client.model.Updates.set;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.MongoSecurityException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.BSONObject;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author Jhonatan Lituma
 */
public class MongoDB {

    private static MongoDB instance;
    private static MongoClientURI uri;
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    private static MongoCredential credential;
    private static MongoCollection<Document> collection;

    JSONArray jsonArray = new JSONArray();
    JSONParser jsonParser = new JSONParser();

    private MongoDB() {

    }

    public static MongoDB getInstance() {
        if (instance == null) {
            instance = new MongoDB();
        }
        return instance;
    }

    public static MongoDatabase conecction() {
        String URI = "mongodb+srv://juan:juan@cluster0.oqpo1.mongodb.net/hotel?retryWrites=true&w=majority";
        try {
            uri = new MongoClientURI(URI);
            mongoClient = new MongoClient(uri);
            database = mongoClient.getDatabase("hotel");

            database.createCollection("Comprobation");
            collection = database.getCollection("Comprobation");
            collection.drop();

        } catch (MongoSecurityException a) {
            database = null;
        }

        return database;
    }

    public static void save(Document document, String collection, MongoDatabase database) {
        MongoCollection<Document> collectionDocument = database.getCollection(collection);
        collectionDocument.insertOne(document);
    }
    
    public static boolean find(String col, String key, Object value, MongoDatabase database) {
        String find = "";
        boolean ocurrency = false;
        MongoCollection<Document> collections = database.getCollection(col);
        FindIterable<Document> iterable = collections.find(gte(key, value));
        MongoCursor<Document> cursor = iterable.iterator();
        while (cursor.hasNext()) {
            find = cursor.next().toJson();
        }
        if (!"".equals(find)) {
            ocurrency = true;
        }
        return ocurrency;
    }

    public static String findToString(String col, String key, Object value, MongoDatabase database) {
        String find = "";
        MongoCollection<Document> collections = database.getCollection(col);
        FindIterable<Document> iterable = collections.find(gte(key, value));
        MongoCursor<Document> cursor = iterable.iterator();
        while (cursor.hasNext()) {
            find = cursor.next().toJson();
        }
        return find;
    }

    public static String findCollection(String col, MongoDatabase database) throws ParseException {
        String json = "";
        JSONArray jsonArray = new JSONArray();
        MongoCollection<Document> collection = database.getCollection(col);
        MongoCursor<Document> resultDocument = collection.find().iterator();
        while (resultDocument.hasNext()) {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(resultDocument.next().toJson());
            jsonObject.remove("_id");
            jsonArray.add(jsonObject);
            json = jsonArray.toJSONString();
        }
        return json;
    }
}
