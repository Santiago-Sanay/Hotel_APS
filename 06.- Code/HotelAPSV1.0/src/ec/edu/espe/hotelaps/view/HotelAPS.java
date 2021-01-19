/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.view;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.hotelaps.model.Autentication;
import ec.edu.espe.hotelaps.model.Consumtion;
import ec.edu.espe.hotelaps.model.Customer;
import ec.edu.espe.hotelaps.model.Hotel;
import ec.edu.espe.hotelaps.model.Product;
import ec.edu.espe.hotelaps.model.Register;
import ec.edu.espe.hotelaps.model.Reservation;
import ec.edu.espe.hotelaps.model.Room;
import ec.edu.espe.hotelaps.model.Shop;
import ec.edu.espe.hotelaps.model.Worker;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class HotelAPS {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        Gson gson = new Gson();
        Shop shop = new Shop();

        int opc;

        do {
            System.out.println("\f");
            System.out.println("BIENVENIDO A HOTEL APS");
            System.out.println("1. Cliente");
            System.out.println("2. Trabajador");
            System.out.println("3. Usuario Registrado");
            System.out.println("Escoja la opción de usuario a registrar:");
            opc = scanner.nextInt();
            scanner.nextLine();
            String nameSearch;

            switch (opc) {
                
                case 1:
                    String idCustomer;
                    String name = "";
                    String documentNumber = "";
                    String address = "";
                    String telephone = "";
                    String email = "";

                    System.out.println("Bienvenido al registro del cliente");
                    System.out.println("Ingrese nombre: ");
                    name = scanner.nextLine();
                    do {
                        System.out.println("Ingrese C.I: ");
                        documentNumber = scanner.nextLine();
                    } while (documentNumber.length() < 1 && documentNumber.length() > 10);

                    System.out.println("Ingrese direccion : ");
                    address = scanner.nextLine();

                    System.out.println("Ingrese número de teléfono: ");
                    telephone = scanner.nextLine();

                    System.out.println("Ingrese email: ");
                    email = scanner.nextLine();

                    idCustomer = documentNumber + "Custom";
                    Customer customer1 = new Customer(idCustomer, name, documentNumber, address, telephone, email);
                    Register registerCustomer = new Register();
                    registerCustomer.registerCustomer(customer1,"listCostumer.json");
                    registerCustomer.registerCustomer(customer1, name+".json" );
                    break;

                case 2:
                    String idWorker;
                    String nameWorker = "";
                    String documentNumberWorker = "";
                    String addressWorker = "";
                    String telephoneWorker = "";
                    String emailWorker = "";
                    boolean access = true;
                    String login = "admin";
                    String password = "admin";

                    System.out.println("Ingrese nombre: ");
                    nameWorker = scanner.nextLine();
                    do {
                        System.out.println("Ingrese C.I: ");
                        documentNumberWorker = scanner.nextLine();
                    } while (documentNumberWorker.length() < 1 && documentNumberWorker.length() > 10);

                    System.out.println("Ingrese dirección: ");
                    addressWorker = scanner.nextLine();

                    System.out.println("Ingrese número de teléfono: ");
                    telephoneWorker = scanner.nextLine();

                    System.out.println("Ingrese email: ");
                    emailWorker = scanner.nextLine();

                    System.out.println("1.Administrativo");
                    System.out.println("2.Limpieza");
                    System.out.println("Seleccione su cargo: ");
                    int employment = scanner.nextInt();
                    if (employment == 2) {
                        access = false;
                    }
                    idWorker = documentNumberWorker + "Worker";
                    Worker worker1 = new Worker(idWorker, nameWorker, documentNumberWorker, addressWorker, telephoneWorker, emailWorker, access, login, password);
                    Register registerWorker = new Register();
                    registerWorker.registerWork(worker1);
                    break;

                case 3:
                    System.out.println("QUE DESEA HACER");
                    System.out.println("1. Servicio al cliente");
                    System.out.println("2. Ingresar como admin");
                    System.out.println("3. Salir");
                    System.out.println("Seleccione una opción: ");
                    int registered;
                    registered = scanner.nextInt();
                    switch (registered) {
                       
                            
                        case 1:

                            boolean verify;
                            
                            do {
                                scanner.nextLine();
                                System.out.println("Ingrese el nombre que registro: ");
                                nameSearch = scanner.nextLine();
                                Autentication autentic;
                                autentic = new Autentication(nameSearch);
                                verify = autentic.autenticationCustomer();
                            } while (verify == false);
                            System.out.println("BIENVENIDO A SERVICIO AL CLIENTE");
                            System.out.println("1.Reservar habitación");
                            System.out.println("2.Comprar");
                            System.out.println("3.Revisar consumo");
                            System.out.println("4.Salir");
                            System.out.println("Seleccione su opción:");
                            int service;
                            System.out.println("Digite su opcion: ");
                            service = scanner.nextInt();
                            switch (service) {
                                case 1:
                                    boolean status;
                                    String numberRoom;
                                    String findRoom;
                                    String stringJson;
                                    System.out.println("Estos son los cuartos disponibles:");
                                    hotel.showRoomFree();
                                    do {
                                        System.out.println("Seleccionar el número de habitación que desea reservar:");
                                        scanner.nextLine();
                                        numberRoom = scanner.nextLine();
                                        findRoom = hotel.findRoom(numberRoom);
                                    } while (findRoom == null);
                                    Room room = new Room(0, 0f, true, 0);
                                    room = gson.fromJson(findRoom, Room.class);
                                    room.setStatus(true);
                                    FileManager.delete("Room.json", numberRoom);
                                    stringJson = gson.toJson(room);
                                    FileManager.save("Room.json", stringJson);
                                    FileManager.save(nameSearch+".json", stringJson);
                                    break;
                                case 2:
                                    int stock = 0;
                                    String nameProduct;
                                    String findProduct;
                                    System.out.println("Estos son los productos disponibles:");
                                    shop.showAllProducts();
                                    do {
                                        System.out.println("Seleccione el nombre producto: ");
                                        scanner.nextLine();
                                        nameProduct = scanner.nextLine();
                                        findProduct = shop.findProduct(nameProduct);
                                    }while(findProduct==null);  
                                    Product pr = new Product(0, 0, 0f, "");
                                    pr = gson.fromJson(findProduct, Product.class);
                                    stock = pr.getStock();
                                    stock -= 1;
                                    pr.setStock(stock);
                                    FileManager.delete("inventoryShop.json", nameProduct);
                                    stringJson = gson.toJson(pr);
                                    FileManager.save("inventoryShop.json", stringJson);
                                    FileManager.save(nameSearch+".json", stringJson);
                                    break;
                                case 3:
                                    Consumtion consumtion = new Consumtion(0,0,0f,null,null,true);
                                    System.out.println("El consumo es " );
                                    consumtion.showAllComsumtion(nameSearch);
                                    break;
                            }
                            break;
                        case 2:
                            String user;
                            String pass;
                            boolean check;
                            do {
                                scanner.nextLine();
                                System.out.println("Ingrese el usuario: ");
                                user = scanner.nextLine();
                                System.out.println("Ingrese la contraseña: ");
                                pass = scanner.nextLine();
                                Autentication autenticAdmin = new Autentication();
                                check = autenticAdmin.autenticationWorker(user, pass);
                                System.out.println("este es el check" + check);
                            } while (check == false);
                            System.out.println("BIENVENIDO AL SISTEMA");
                            System.out.println("Seleccione su opción");
                            System.out.println("1.Agregar productos a la tienda");
                            System.out.println("2.Habitaciones");
                            System.out.println("3.Ver productos de la tienda");
                            System.out.println("4.Salir");
                            int adm;
                            System.out.println("Digite su opción: ");
                            adm = scanner.nextInt();
                            switch (adm) {
                                case 1:
                                    int idProduct;
                                    int stock;
                                    float salePrice;
                                    String nameProduct;

                                    System.out.println("Usted está agregando un producto: ");
                                    scanner.nextLine();
                                    System.out.println("Ingrese el nombre del producto: ");
                                    nameProduct = scanner.nextLine();
                                    System.out.println("Ingrese el id del producto: ");
                                    idProduct = scanner.nextInt();
                                    System.out.println("Ingrese la cantidad que desea agregar: ");
                                    stock = scanner.nextInt();
                                    System.out.println("Ingrese el precio de venta: ");
                                    salePrice = scanner.nextFloat();

                                    Product product1 = new Product(idProduct, stock, salePrice, nameProduct);
                                    Shop apsShop = new Shop();
                                    apsShop.addProduct(product1);
                                    break;
                                case 2:
                                    int roomOpt = 0;
                                    System.out.println("1. Habilitar habitación");
                                    System.out.println("2. Disponibilidad de habitaciones");
                                    System.out.println("Seleccione opción: ");
                                    roomOpt = scanner.nextInt();

                                    switch (roomOpt) {
                                        case 1:
                                            Room room = new Room(0, 0f, true, 0);
                                            System.out.println("Ingrese el número de habitación:");
                                            room.setNumberRoom(scanner.nextInt());
                                            System.out.println("Ingrese el precio de la habitación:");
                                            room.setPrice(scanner.nextFloat());
                                            room.setCapacityPerson(4);

                                            hotel.assigmentRoom(room);
                                            break;
                                        case 2:
                                            hotel.showAllRoom();
                                            break;
                                    }
                                    break;
                                case 3:
                                    shop.showAllProducts();
                                case 4:
                                    System.exit(0);
                                    break;
                            }
                            break;
                    }

                    break;

            }

            //Runtime.getRuntime().exec("cls"); Clear Console
        } while (opc != 4);
    }

}
