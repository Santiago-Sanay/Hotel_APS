/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.controller;

import com.google.gson.Gson;
import ec.edu.espe.hotelaps.model.Consumption;
import ec.edu.espe.hotelaps.model.Customer;
import ec.edu.espe.hotelaps.model.Hotel;
import ec.edu.espe.hotelaps.model.Product;
import ec.edu.espe.hotelaps.model.Registration;
import ec.edu.espe.hotelaps.model.Room;
import ec.edu.espe.hotelaps.model.Shop;
import ec.edu.espe.hotelaps.model.Worker;
import java.util.Scanner;

/**
 *
 * @author SSS SANTIAGO
 */
public class MenuController {

    public static void registerCustumer() {
        Scanner scanner = new Scanner(System.in);

        String id;
        String name;
        String documentNumber;
        String telephone;
        String email;

        System.out.println("Bienvenido al registro del cliente");
        System.out.println("Ingrese nombre: ");
        name = scanner.nextLine();

        System.out.println("Ingrese C.I: ");
        documentNumber = scanner.nextLine();

        System.out.println("Ingrese número de teléfono: ");
        telephone = scanner.nextLine();

        System.out.println("Ingrese email: ");
        email = scanner.nextLine();

        id = documentNumber + "Custom";

        Customer customerNew = new Customer(name, id, documentNumber, telephone, email);

        Registration registerCustomer = new Registration();

        registerCustomer.registerCustomer(customerNew, "listCostumer.json");

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
        Registration registerWorker = new Registration();
        registerWorker.registerWork(workerNew);

    }

    public static void pickRoomClient() {
        Hotel hotel = new Hotel();
        Customer customerConsumption = null;
        Scanner scanner = new Scanner(System.in);
        boolean status;
        String numberRoom;
        String findRoom;
        String nameSearch = null;

        int option;
        do {

            System.out.println("Estos son los cuartos disponibles:");

            hotel.showRoomFree("true");

            System.out.println("Seleccionar el número de habitación que desea reservar:");
            scanner.nextLine();

            numberRoom = scanner.nextLine();

            Room room = new Room();

            hotel.updateRooms(numberRoom, room);
            Consumption consumptionRoom = new Consumption();

            consumptionRoom.setNameCustomer(nameSearch);
            consumptionRoom.setNameProduct("Reservación de habitación");
            consumptionRoom.setSalePrice(room.getPrice());
            customerConsumption.addConsumption(consumptionRoom);
            System.out.println("Desea reservar otra habitacion?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            option = scanner.nextInt();
        } while (option != 2);
    }

    public static void doRoomService( String nameSearch) {
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

}
