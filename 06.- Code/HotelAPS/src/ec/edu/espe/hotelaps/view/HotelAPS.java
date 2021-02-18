/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.view;

import com.google.gson.Gson;
import ec.edu.espe.hotelaps.controller.MenuController;
import ec.edu.espe.hotelaps.model.Authentication;
import ec.edu.espe.hotelaps.model.Consumption;
import ec.edu.espe.hotelaps.model.Customer;
import ec.edu.espe.hotelaps.model.Hotel;
import ec.edu.espe.hotelaps.model.Product;
import ec.edu.espe.hotelaps.model.Registration;
import ec.edu.espe.hotelaps.model.Room;
import ec.edu.espe.hotelaps.model.Shop;
import ec.edu.espe.hotelaps.model.Worker;
import ec.edu.espe.hotelaps.utils.DataVerification;
import ec.edu.espe.hotelaps.utils.MainMenu;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class HotelAPS {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        Gson gson = new Gson();
        Shop shop = new Shop();
        String nameSearch ;

        Customer customerConsumption;

        Consumption consumption = new Consumption();
        int opc;

        do {
            MainMenu.mainMenu();
            opc = scanner.nextInt();
            switch (opc) {

                case 1: {
                    MenuController.registerCustumer();
                    break;
                }
                case 2: {
                    MenuController.registerWorker();
                    break;
                }
                case 3: {
                    MainMenu.menuLogin();
                    int registered;
                    registered = scanner.nextInt();
                    switch (registered) {

                        case 1: {
                            nameSearch = DataVerification.custumer();
                            boolean verify;
                            //DataVerification.custumer();
                            System.out.println(""+nameSearch);
                            int service;
                            service = scanner.nextInt();

                            switch (service) {
                                case 1: {
                                    MenuController.pickRoomClient();
                                    break;

                                }
                                case 2: {
                                    MenuController.doRoomService(nameSearch);
                                    break;
                                }
                                case 3: {
                                    int option;

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

}
