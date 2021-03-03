/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.dbmanager.MongoDB;
import ec.edu.espe.hotelaps.model.Authentication;
import ec.edu.espe.hotelaps.model.Consumption;
import ec.edu.espe.hotelaps.model.Customer;
import ec.edu.espe.hotelaps.model.FrmDatabaseSetup;
import ec.edu.espe.hotelaps.model.Hotel;
import ec.edu.espe.hotelaps.model.Inventory;
import ec.edu.espe.hotelaps.model.Product;
import ec.edu.espe.hotelaps.model.Registration;
import ec.edu.espe.hotelaps.model.Registry;
import ec.edu.espe.hotelaps.model.Room;
import ec.edu.espe.hotelaps.model.Shop;
import ec.edu.espe.hotelaps.model.Worker;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.Document;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author Samuel Sañay ESPE-DCCO
 * @author Gabriel Rosero ESPE-DCCO
 * @author Jimmy Simbaña
 */
public class MenuController {

    public static void registerCustumer() {
        Scanner scanner = new Scanner(System.in);
        Document document = new Document();
        String id;
        String name;
        String documentNumber;
        String telephone;
        String email;

        System.out.println("Bienvenido al registro del cliente");

        System.out.println("Ingrese nombre: ");
        name = scanner.nextLine();
        document.put("name", name);

        System.out.println("Ingrese C.I: ");
        documentNumber = scanner.nextLine();
        document.put("documentNumber", documentNumber);

        System.out.println("Ingrese número de teléfono: ");
        telephone = scanner.nextLine();
        document.put("telephone", telephone);

        System.out.println("Ingrese email: ");
        email = scanner.nextLine();
        document.put("email", email);

        id = documentNumber + "Custom";
        document.put("id", id);

        Customer customerNew = new Customer(name, id, documentNumber, telephone, email);
        /*
        Registry registry = new Registry("Customer");
        registry.createCustomer(customerNew);*/
        MongoDB.save(document, "Customer", FrmDatabaseSetup.database);

    }

    public static void registerWorker() {
        Scanner scanner = new Scanner(System.in);
        String id;
        String name;
        String documentNumber;
        String telephone;
        String email;
        boolean access = true;
        String login = "admin";
        String password = "admin";

        System.out.println("Ingrese nombre: ");
        name = scanner.nextLine();

        System.out.println("Ingrese C.I: ");
        documentNumber = scanner.nextLine();

        System.out.println("Ingrese número de teléfono: ");
        telephone = scanner.nextLine();

        System.out.println("Ingrese email: ");
        email = scanner.nextLine();

        System.out.println("1.Administrativo");
        System.out.println("2.Limpieza");
        System.out.println("Seleccione su cargo: ");
        int employment = scanner.nextInt();
        if (employment == 2) {
            access = false;
        }
        id = documentNumber + "Worker";

        Worker workerNew = new Worker(login, password, access, id, name, documentNumber, telephone, email);
        Registry registry = new Registry("Workers");
        registry.createWorker(workerNew);

    }

    public static void pickRoomClient() throws ParseException {
        Hotel hotel = new Hotel();
        Document document = new Document();
        Customer customerConsumption = null;
        Scanner scanner = new Scanner(System.in);
        boolean status;
        String numberRoom;
        String findRoom;
        String nameSearch = null;
        
        /*ArrayList<Customer> customers = new ArrayList<>();
        Gson gson = new Gson();
        String json = MongoDB.findCollection("Customers", FrmDatabaseSetup.database);

        java.lang.reflect.Type customerType = new TypeToken<ArrayList<Customer>>() {
        }.getType();
        customers = gson.fromJson(json, customerType);
        for (Customer customer : customers) {
        }*/
        //Sacar de la base de datos a lista de objtetos
        
        int option;
        do {

            System.out.println("Habitaciones:");

            //hotel.showRoomFree("true");
            System.out.println(MongoDB.findCollection("Room" , FrmDatabaseSetup.database));
            
            System.out.println("Seleccionar el número de habitación que desea reservar:");
            scanner.nextLine();
            
            numberRoom = scanner.nextLine();
            
            
            MongoDB.findToString("Room", "numberRoom", numberRoom, FrmDatabaseSetup.database);
                    
            Room room = new Room();
            
            //hotel.updateRooms(numberRoom, room);
            
            Consumption consumptionRoom = new Consumption();
            
            //consumptionRoom.setNameCustomer(nameSearch);
            document.put("nameCustomer", nameSearch);
            //consumptionRoom.setNameProduct();
            document.put("nameProduct", "Reservación de habitación");
            consumptionRoom.setSalePrice(room.getPrice());
            document.put("nameProduct", "Reservación de habitación");
            customerConsumption.addConsumption(consumptionRoom);
            System.out.println("Desea reservar otra habitacion?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            option = scanner.nextInt();
        } while (option != 2);
    }

    public static void doRoomService(String nameSearch) {
        int option;
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        Gson gson = new Gson();
        Customer customerConsumption = null;
        Consumption consumption = new Consumption();

        Product product = new Product(0, 0, 0f, "", true);
        int stock = 0;
        String nameProduct;
        String findProduct;

        do {
            System.out.println("Estos son los productos disponibles:");

            shop.showAvailableProduct("true");

            System.out.println("Seleccione el nombre producto: ");
            nameProduct = scanner.nextLine();
            findProduct = shop.findProduct(nameProduct);

            product = gson.fromJson(findProduct, Product.class);
            stock = product.getStock();
            stock -= 1;

            if (stock <= 0) {

                product.setIsAvailable(false);

            }
            consumption.setNameCustomer(nameSearch);
            consumption.setNameProduct(nameProduct);
            consumption.setSalePrice(product.getSalePrice());
            consumption.setStatus(true);
            customerConsumption = new Customer("", "", "", "", "");
            customerConsumption.addConsumption(consumption);
            shop.updateStock(nameProduct, product);

            System.out.println("Desea comprar nuevamente");
            System.out.println("1. Si");
            System.out.println("2. No");

            option = scanner.nextInt();
        } while (option != 2);
    }

    public static void payService() {
        int option;
        Customer customerConsumption;
        Scanner scanner = new Scanner(System.in);
        customerConsumption = new Customer("", "", "", "", "");
        String nameSearch = "";
        customerConsumption.showEachConsumption(nameSearch);

        System.out.println("Desea cancelar el servicio ");
        System.out.println("1. Si");
        System.out.println("2. No");
        option = scanner.nextInt();

        if (option == 1) {
            System.out.println("Cancele este valor en caja");
            System.out.println(customerConsumption.calculateTotal(nameSearch));
        } else {
            System.out.println("Gracias por preferirnos");
        }
        customerConsumption = new Customer("", "", "", "", "");
        customerConsumption.showEachConsumption(nameSearch);

        System.out.println("Desea cancelar el servicio ");
        System.out.println("1. Si");
        System.out.println("2. No");
        option = scanner.nextInt();

        if (option == 1) {
            System.out.println("Cancele este valor en caja");
            System.out.println(customerConsumption.calculateTotal(nameSearch));
        } else {
            System.out.println("Gracias por preferirnos");
        }
    }

    public static void enterSistem() {
        String user;
        Scanner scanner = new Scanner(System.in);
        String pass;
        boolean check;
        do {
            scanner.nextLine();

            System.out.println("Ingrese el usuario: ");
            user = scanner.nextLine();

            System.out.println("Ingrese la contraseña: ");
            pass = scanner.nextLine();

            Authentication authenticationAdmin = new Authentication();
            check = authenticationAdmin.authenticateWorker(user, pass);

            System.out.println("Este es el check" + check);

        } while (check == false);
    }

    public static void addProduct() {
        int option;
        int idProduct;
        int stock;
        float salePrice;
        String nameProduct;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Usted está agregando un producto... ");
            scanner.nextLine();

            System.out.println("Ingrese el nombre del producto: ");
            nameProduct = scanner.nextLine();

            System.out.println("Ingrese el id del producto: ");
            idProduct = scanner.nextInt();

            System.out.println("Ingrese la cantidad que desea agregar: ");
            stock = scanner.nextInt();

            System.out.println("Ingrese el precio de venta: ");
            salePrice = scanner.nextFloat();

            Product productNew = new Product(idProduct, stock, salePrice, nameProduct, true);
            Inventory inventory = new Inventory();
            inventory.createProduct(productNew);

            System.out.println("Desea ingresar otro producto");
            System.out.println("1. Si");
            System.out.println("2. No");
            option = scanner.nextInt();
        } while (option != 2);
    }

    public static void avilityRoom() {
        Room room = new Room(0, 0f, true, 0);
        Scanner scanner = new Scanner(System.in);
        Hotel hotel;

        System.out.println("Ingrese el número de habitación:");
        room.setNumberRoom(scanner.nextInt());

        System.out.println("Ingrese el precio de la habitación:");
        room.setPrice(scanner.nextFloat());

        System.out.println("Ingrese capacidad de la habitación");
        room.setCapacityPerson(scanner.nextInt());
        hotel = new Hotel();//verify line274-284
        hotel.assigmentRoom(room);
    }

    public static void searchPerson(String name) {
        Registry registry = new Registry("Customers");
        String nameSearch = "";
        Scanner scanner = new Scanner(System.in);
        boolean verify = false;

        registry.searchPerson(nameSearch);
        while (verify == false);

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
