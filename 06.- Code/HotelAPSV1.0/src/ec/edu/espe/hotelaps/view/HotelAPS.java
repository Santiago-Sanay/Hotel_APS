/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.view;

import ec.edu.espe.hotelaps.model.Autentication;
import ec.edu.espe.hotelaps.model.Customer;
import ec.edu.espe.hotelaps.model.Register;
import ec.edu.espe.hotelaps.model.Worker;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class HotelAPS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;

        do {
            System.out.println("Bienvenido a Hotel APS");
            System.out.println("Escoja la opción de usuario a registrar");
            System.out.println("1. Cliente");
            System.out.println("2. Trabajador");
            System.out.println("3. Usuario Registrado");
            System.out.println("Seleccione opción: ");
            opc = scanner.nextInt();
            scanner.nextLine();
        } while (opc < 1 && opc > 2);
        switch (opc) {
            case 1:
                String idCustomer;
                String name = "";
                String documentNumber = "";
                String address = "";
                String telephone = "";
                String email = "";

                System.out.println("Bienvenido al registro del Cliente");
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
                registerCustomer.registerCustomer(customer1);
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

                System.out.println("Ingrese direccion : ");
                addressWorker = scanner.nextLine();

                System.out.println("Ingrese número de teléfono: ");
                telephoneWorker = scanner.nextLine();

                System.out.println("Ingrese email: ");
                emailWorker = scanner.nextLine();

                System.out.println("Cargo");
                System.out.println("1.Administrativo");
                System.out.println("2.Limpieza");
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
                System.out.println("1.servicio al cuarto");
                System.out.println("2.ingresar como admin");
                System.out.println("3.salir");
                int registered;
                registered = scanner.nextInt();
                switch (registered) {
                    case 1:

                        System.out.println("Ingrese C.I: ");
                        documentNumber = scanner.nextLine();

                        Autentication autentic;
                        autentic = new Autentication(documentNumber);
                        autentic.autenticationCustomer();
                        break;
                    case 2:
                        String user;
                        String pass;
                        boolean check;
                        do {
                            scanner.nextLine();
                            System.out.println("Ingrese el usuario ");
                            user = scanner.nextLine();
                            System.out.println("Ingrese la contraseña");
                            pass = scanner.nextLine();
                            Autentication autenticAdmin = new Autentication();
                            check = autenticAdmin.autenticationWorker(user, pass);
                            System.out.println("este es el check" + check);
                        } while (check == false);

                        break;
                }

                break;

        }

    }

}
