/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.view;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.dbmanager.MongoDB;
import ec.edu.espe.hotelaps.controller.MenuController;
import ec.edu.espe.hotelaps.utils.Conection;
import ec.edu.espe.hotelaps.model.Consumption;
import ec.edu.espe.hotelaps.model.Customer;
import ec.edu.espe.hotelaps.model.FrmDatabaseSetup;
import ec.edu.espe.hotelaps.model.Hotel;
import ec.edu.espe.hotelaps.model.Shop;
import ec.edu.espe.hotelaps.utils.DataVerification;
import ec.edu.espe.hotelaps.utils.MainMenu;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 * @author Samuel Sañay ESPE-DCCO
 * @author Gabriel Rosero ESPE-DCCO
 */
public class HotelAPS {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws ParseException, org.json.simple.parser.ParseException {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        Gson gson = new Gson();
        Shop shop = new Shop();
        //Conection conection = new Conection();
        String nameSearch;

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
                    System.out.println(MenuController.findCollection("Customer", FrmDatabaseSetup.database));
                }
                case 3: {
                    MainMenu.menuLogin();

                    int registered;
                    boolean e = false;
                    registered = scanner.nextInt();
                    switch (registered) {
                        case 1: {
                            scanner.nextLine();
                            System.out.println("Ingrese el nombre que registro: ");
                            nameSearch = scanner.nextLine();
                            e = MongoDB.find("Customer", "name", nameSearch, FrmDatabaseSetup.database);
                            if (e == false) {
                                System.out.println("No se encontro en el registro");
                            } else {
                                System.out.println("Esta en el registro");
                                int service;
                                MainMenu.menuCustomer();
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

                                        MenuController.payService();

                                        break;
                                    }
                                    default: {
                                        MainMenu.choseOption();
                                        break;

                                    }
                                }
                                break;
                            }

                            //MenuController.searchPerson(nameSearch);
                            /*
                            nameSearch = DataVerification.custumer();
                            boolean verify;
                            System.out.println("" + nameSearch);*/
                        }

                        case 2: {
                            MenuController.enterSistem();
                            MainMenu.menuWorker();
                            int adm;
                            adm = scanner.nextInt();
                            switch (adm) {
                                case 1: {
                                    MenuController.addProduct();
                                    break;
                                }
                                case 2: {

                                    int roomOpt = 0;

                                    MainMenu.menuRoomChange();
                                    roomOpt = scanner.nextInt();

                                    switch (roomOpt) {
                                        case 1: {
                                            MenuController.avilityRoom();
                                            break;
                                        }
                                        case 2: {
                                            hotel.printAllRoom();
                                            break;

                                        }
                                        default:
                                            MainMenu.choseOption();
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
                                    MainMenu.choseOption();
                                    break;
                            }

                            break;
                        }
                        default:
                            MainMenu.choseOption();
                            break;
                    }

                }
                case 4: {
                    MainMenu.finalMessage();
                    break;
                }
                default: {
                    MainMenu.choseOption();
                    break;
                }
            }

        } while (opc != 4);
    }
}
