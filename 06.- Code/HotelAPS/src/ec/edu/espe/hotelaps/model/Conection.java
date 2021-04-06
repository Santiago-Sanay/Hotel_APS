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
import java.util.ArrayList;
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

//    public void save(Customer customer) {
//
//        BSONObject bson;
//        Document admin;
//        admin = new Document("name", customer.getName());
//        admin.append("id", customer.getId());
//        admin.append("documentNumber", customer.getDocumentNumber());
//        admin.append("Telephone", customer.getTelephone());
//        admin.append("Email", customer.getEmail());
//        collection.insertOne(admin);
//        mongo.close();
//
//    }
    
    
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
    
    public ArrayList<Product> retrieveProduct() {
        Product product;
        MongoCursor<Document> searchDocument = collection.find().iterator();
        String id;
        String stock;
        String price;
        String name;
        String status;

        ArrayList<Product> productRetrieved = new ArrayList<Product>();
        while (searchDocument.hasNext()) {
            Document theObj = searchDocument.next();
            id = gson.toJson(theObj.get("id")).replace("\"", "");
            stock = gson.toJson(theObj.get("stock")).replace("\"", "");
            price = gson.toJson(theObj.get("price")).replace("\"", "");
            name = gson.toJson(theObj.get("name")).replace("\"", "");
            status = gson.toJson(theObj.get("status")).replace("\"", "");
            product = new Product(id,stock,price,name,true);
        }
        return productRetrieved;

    }
    
//    public void saveProduct(Product product) {
//        
//        BSONObject bson;
//        Document products;
//        products = new Document("name", product.getNameProduct());
//        products.append("id", product.getIdProduct());
//        products.append("price", product.getSalePrice());
//        products.append("stock", product.getStock());
//        products.append("availability", product.getIsAvailable());
//        collection.insertOne(products);
//        mongo.close();
//
//    }
    
//    public void saveRoom(Room room) {
//        
//        BSONObject bson;
//        Document rooms;
//        rooms = new Document("number", room.getNumberRoom());
//        rooms.append("price", room.getPrice());
//        rooms.append("status", room.getStatus());
//        rooms.append("type", room.getCapacityPerson());
//        rooms.append("description", room.getDescription());
//        collection.insertOne(rooms);
//        mongo.close();
//
//    }
    
//    public Customer retrieveNameCustomer(String username) {
//        Customer customer;
//        MongoCursor<Document> searchDocument = collection.find().iterator();
//        String name,id,documentNumber,telephone,email;
//
//        Customer customerRetrieved = new Customer("name", " id","documentNumber", "telephone", "email");
//        while (searchDocument.hasNext()) {
//            Document theObj = searchDocument.next();
////            name = gson.toJson(theObj.get("name")).replace("\"", "");
//             id = gson.toJson(theObj.get("id"));
////            documentNumber = gson.toJson(theObj.get("documentNumber")).replace("\"", "");
////            telephone = gson.toJson(theObj.get("telephone")).replace("\"", "");
////            email = gson.toJson(theObj.get("email")).replace("\"", "");
//            customer = new Customer(name,id,documentNumber,telephone,email);
//    
//            if (username.)
//           if(username.equals(customer.getId()){
//                customerRetrieved = customer;
//            }
//
//        }
//        return customerRetrieved;

   // }
    public ArrayList<Product> retrieveProducts() {
        ArrayList<Product> products = new ArrayList<>();
        MongoCursor<Document> resultDocument = collection.find().iterator();
        String idProduct;
        String stock;
        String salePrice;
        String nameProduct;
        Boolean isAvailable;
        
        Product product;

        while (resultDocument.hasNext()) {
            Document lineByLine = resultDocument.next();
            idProduct = gson.toJson(lineByLine.get("id")).replace("\"", "");
            stock = gson.toJson(lineByLine.get("stock")).replace("\"", "");
            salePrice = gson.toJson(lineByLine.get("price")).replace("\"", "");
            nameProduct = gson.toJson(lineByLine.get("name")).replace("\"", "");
            isAvailable = Boolean.parseBoolean(gson.toJson(lineByLine.get("availability")));         
            product = new Product(idProduct, stock, salePrice, nameProduct,isAvailable);
            products.add(product);
        }
        return products;

    }
    
        public ArrayList<Room> retrieveRooms() {
        ArrayList<Room> rooms = new ArrayList<>();
        MongoCursor<Document> resultDocument = collection.find().iterator();
        String numberRoom;
        String price;
        String status;
        String capacityPerson;
        String description;     
        Room room;

        while (resultDocument.hasNext()) {
            Document lineByLine = resultDocument.next();
            numberRoom = gson.toJson(lineByLine.get("number")).replace("\"", "");
            price = gson.toJson(lineByLine.get("price")).replace("\"", "");
            status = gson.toJson(lineByLine.get("status")).replace("\"", "");
            capacityPerson = gson.toJson(lineByLine.get("type")).replace("\"", "");
            description = gson.toJson(lineByLine.get("description")).replace("\"", "");      
            room = new Room(numberRoom, price, status, capacityPerson, description);
            rooms.add(room);
        }
        return rooms;

    }
        public ArrayList<Customer> retrieveCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        MongoCursor<Document> resultDocument = collection.find().iterator();
        String name;
        String id;
        String documentNumber;
        String telephone;
        String email;
        Customer customer;

        while (resultDocument.hasNext()) {
            Document theObj = resultDocument.next();
            name = gson.toJson(theObj.get("name")).replace("\"", "");
            id = gson.toJson(theObj.get("id")).replace("\"", "");
            documentNumber = gson.toJson(theObj.get("documentNumber")).replace("\"", "");
            telephone = gson.toJson(theObj.get("telephone")).replace("\"", "");
            email = gson.toJson(theObj.get("email")).replace("\"", "");
            customer = new Customer(name,id,documentNumber,telephone,email);
            customers.add(customer);
        }
        return customers;

    }
        
    
    public Product retrieveNameProduct(String username) {
        Product product;
        MongoCursor<Document> searchDocument = collection.find().iterator();
        String name,id,stock,price,status;

        Product productRetrieved = new Product("id", " stock","price", "name", true);
        while (searchDocument.hasNext()) {
            Document theObj = searchDocument.next();
            id = gson.toJson(theObj.get("id")).replace("\"", "");
            stock = gson.toJson(theObj.get("stock")).replace("\"", "");
            price = gson.toJson(theObj.get("price")).replace("\"", "");
            name = gson.toJson(theObj.get("name")).replace("\"", "");
            status = gson.toJson(theObj.get("status")).replace("\"", "");
            product = new Product(id,stock,price,name,true);

            if (username.contentEquals(product.getNameProduct())) {
                productRetrieved = product;
            }
            System.out.println("prueba impresio--->"+product);

        }
        return productRetrieved;

    }

}

