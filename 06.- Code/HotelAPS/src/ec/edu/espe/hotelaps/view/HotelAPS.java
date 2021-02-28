/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.view;

import com.google.gson.Gson;
import ec.edu.espe.hotelaps.model.Authentication;
import ec.edu.espe.hotelaps.model.Consumption;
import ec.edu.espe.hotelaps.model.Customer;
import ec.edu.espe.hotelaps.model.Hotel;
import ec.edu.espe.hotelaps.model.Product;
import ec.edu.espe.hotelaps.model.Registration;
import ec.edu.espe.hotelaps.model.Room;
import ec.edu.espe.hotelaps.model.Shop;
import ec.edu.espe.hotelaps.model.Worker;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class HotelAPS {
    public static String documentNumber;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        Gson gson = new Gson();
        Shop shop = new Shop();
        String nameSearch;
        Customer customerConsumption; 
        //Customer customer = new Customer();

        Consumption consumption = new Consumption();
        int opc;

        do {
            HotelAPS hotelaps = new HotelAPS();
            opc=hotelaps.mainMenu();

            switch (opc) {

                case 1: {

                    String id;
                    String name ;
                    String telephone;
                    String email;

                    System.out.println("Bienvenido al registro del cliente");
                    System.out.println("Ingrese nombre: ");
                    name = scanner.nextLine();

                    System.out.println("Ingrese C.I: ");
                    documentNumber = scanner.nextLine();
                    if(documentNumber.length()==10){
                    }else{
                        reEnterCI();
                    }

                    System.out.println("Ingrese número de teléfono: ");
                    telephone = scanner.nextLine();

                    System.out.println("Ingrese email: ");
                    email = scanner.nextLine();

                    id = documentNumber + "Custom";

                    Customer customerNew = new Customer(name,id, documentNumber,telephone,email);

                    Registration registerCustomer = new Registration();

                    registerCustomer.registerCustomer(customerNew, "listCostumer.json");
                    
                    break;
                }
                case 2: {

                    String id;
                    String name ;
                    String telephone;
                    String email;
                    boolean access = true;
                    String login = "admin";
                    String password = "admin";

                    System.out.println("Ingrese nombre: ");
                    name = scanner.nextLine();

                    System.out.println("Ingrese C.I: ");
                    documentNumber = scanner.nextLine();
                    if(documentNumber.length()==10){
                    }else{
                        reEnterCI();
                    }

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
                    //Metodo pedir datos en variables de abajo
                    Worker workerNew = new Worker(login,password,access,id,name,documentNumber,telephone,email);
                    Registration registerWorker = new Registration();
                    registerWorker.registerWork(workerNew);

                    break;
                }
                case 3: {

                    System.out.println("SERVICIO ELECTRÓNICO");
                    System.out.println("1. Servicio al cliente");
                    System.out.println("2. Ingresar como admin");
                    System.out.println("Seleccione una opción: ");
                    
                    int registered;
                    registered = scanner.nextInt();

                    switch (registered) {

                        case 1: {

                            boolean verify;

                            do {
                                scanner.nextLine();
                                System.out.println("Ingrese el nombre que registro: ");
                                nameSearch = scanner.nextLine();

                                Authentication authentication;
                                authentication = new Authentication(nameSearch);
                                verify = authentication.authenticateCustomer();

                            } while (verify == false);

                            int service;

                            System.out.println("BIENVENIDO A SERVICIO AL CLIENTE");
                            System.out.println("1.Reservar habitación");
                            System.out.println("2.Comprar");
                            System.out.println("3.Revisar consumo");

                            System.out.println("Seleccione su opción:");
                            service = scanner.nextInt();

                            switch (service) {
                                case 1: {

                                    boolean status;
                                    String numberRoom;
                                    String findRoom;
                                    int option;
                                    do {

                                        System.out.println("Estos son los cuartos disponibles:");
                                        hotel.showRoomFree("true");

                                        System.out.println("Seleccionar el número de habitación que desea reservar:");
                                        scanner.nextLine();

                                        numberRoom = scanner.nextLine();
                                        findRoom = hotel.findRoom(numberRoom);

                                        Room room = new Room(0, 0f, true, 0);

                                        room = gson.fromJson(findRoom, Room.class);
                                        /*System.out.println("inicio");
                                        System.out.println(findRoom);
                                        System.out.println("fin");*/
                                        room.setStatus(false);
                                        customerConsumption = new Customer("","","","","");
                                        Consumption consumptionRoom = new Consumption();
                                        consumptionRoom.setNameCustomer(nameSearch);
                                        consumptionRoom.setNameProduct("Reservación de habitación");
                                        consumptionRoom.setSalePrice(room.getPrice());

                                        customerConsumption.addConsumption(consumptionRoom);

                                        hotel.updateRooms(numberRoom, room);

                                        customerConsumption.addConsumption(consumptionRoom);
                                        System.out.println("Desea reservar otra habitacion?");
                                        System.out.println("1. SI");
                                        System.out.println("2. NO");
                                        option = scanner.nextInt();
                                    } while (option != 2);
                                    break;

                                }
                                case 2: {
                                    int option;
                                    Product product = new Product(0, 0, 0f, "", true);
                                    int stock = 0;
                                    String nameProduct;
                                    String findProduct;
                                    do {
                                        System.out.println("Estos son los productos disponibles:");

                                        shop.showAvailableProduct("true");

                                        System.out.println("Seleccione el nombre producto: ");
                                        scanner.nextLine();

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
                                        customerConsumption=new Customer("","","","","");
                                        customerConsumption.addConsumption(consumption);
                                        shop.updateStock(nameProduct, product);

                                        System.out.println("Desea comprar nuevamente");
                                        System.out.println("1. Si");
                                        System.out.println("2. No");

                                        option = scanner.nextInt();
                                    } while (option != 2);
                                    break;
                                }
                                case 3: {
                                    int option;
                                    customerConsumption=new Customer("","","","","");
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

                                    break;
                                }
                                default: {
                                    System.out.println("Opción Inválida");
                                    break;

                                }
                            }
                            break;
                        }

                        case 2: {
                            String user;
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

                            System.out.println("BIENVENIDO AL SISTEMA");
                            System.out.println("Seleccione su opción");
                            System.out.println("1.Agregar productos a la tienda");
                            System.out.println("2.Habitaciones");
                            System.out.println("3.Ver productos de la tienda");
                            int adm;

                            System.out.println("Digite su opción: ");
                            adm = scanner.nextInt();
                            switch (adm) {
                                case 1: {
                                    int option;
                                    int idProduct;
                                    int stock;
                                    float salePrice;
                                    String nameProduct;

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
                                        Shop apsShop = new Shop();
                                        apsShop.addProduct(productNew);
                                        System.out.println("Desea ingresar otro producto");
                                        System.out.println("1. Si");
                                        System.out.println("2. No");
                                        option = scanner.nextInt();
                                    } while (option != 2);
                                    break;
                                }
                                case 2: {

                                    int roomOpt = 0;

                                    System.out.println("1. Habilitar habitación");
                                    System.out.println("2. Disponibilidad de habitaciones");
                                    System.out.println("Seleccione opción: ");
                                    roomOpt = scanner.nextInt();

                                    switch (roomOpt) {
                                        case 1: {
                                            Room room = new Room(0, 0f, true, 0);

                                            System.out.println("Ingrese el número de habitación:");
                                            room.setNumberRoom(scanner.nextInt());

                                            System.out.println("Ingrese el precio de la habitación:");
                                            room.setPrice(scanner.nextFloat());

                                            System.out.println("Ingrese capacidad de la habitación");
                                            room.setCapacityPerson(scanner.nextInt());
                                            hotel.assigmentRoom(room);

                                            break;
                                        }
                                        case 2: {

                                            hotel.printAllRoom();
                                            break;

                                        }
                                        default:

                                            System.out.println("Opción Inválida");

                                            break;
                                    }
                                    break;
                                }
                                case 3: {

                                    shop.printAllProduct();

                                    break;
                                }
                                case 4: {

                                }

                                break;
                                default:
                                    System.out.println("Opción Inválida");
                                    break;
                            }

                            break;
                        }

                        default:
                            System.out.println("Opción Inválida");

                            break;

                    }

                }
                case 4: {

                    System.out.println("Gracias por usar nuestro servicio electrónico.");
                    break;
                }
                default: {

                    System.out.println("Opción incorrecta");
                    break;
                }
            }

        } while (opc != 4);

    }

    private static void reEnterCI() {
        Scanner scanner = new Scanner(System.in);
        while (documentNumber.length()!=10) {
            if(documentNumber.length()!=10){
                if(documentNumber.length()<10){
                    System.out.println("Demasiado corta, su CI debe tener 10 caracteres!!");    
                    System.out.println("  Reingrese su CI! ");
                    System.out.print(" CI: ");
                    documentNumber = scanner.nextLine();
                }
                if(documentNumber.length()>10){
                    System.out.println("Demasiado larga, su CI debe tener 10 caracteres");    
                    System.out.println("  Reingrese su CI! ");
                    System.out.print(" CI: ");
                    documentNumber = scanner.nextLine();
                }
            }
        }    
    }

    public int mainMenu() {
        Scanner scanner = new Scanner(System.in);
        int opc;
        System.out.println("BIENVENIDO A HOTEL APS");
        System.out.println("1. Registrar Cliente");
        System.out.println("2. Registrar Trabajador");
        System.out.println("3. Usuario Registrado");
        System.out.println("4. Salir");
        System.out.println("Seleccione una opción:");
        opc = scanner.nextInt();
        scanner.nextLine();
        return opc;
    }
}
