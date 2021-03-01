/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.utils;

import ec.edu.espe.hotelaps.model.Customer;

/**
 * @author Samuel Sañay ESPE-DCCO
 * @author Gabriel Rosero ESPE-DCCO
 */
public class MainMenu {

    public static void mainMenu() {

        System.out.println("BIENVENIDO A HOTEL APS");
        System.out.println("1. Registrar Cliente");
        System.out.println("2. Registrar Trabajador");
        System.out.println("3. Usuario Registrado");
        System.out.println("4. Salir");
        System.out.println("Seleccione una opción:");

    }

    public static void menuLogin() {

        System.out.println("SERVICIO ELECTRÓNICO");
        System.out.println("1. Servicio al cliente");
        System.out.println("2. Ingresar como admin");
        System.out.println("Seleccione una opción: ");
    }

    public static void menuCustomer() {

        System.out.println("BIENVENIDO A SERVICIO AL CLIENTE");
        System.out.println("1.Reservar habitación");
        System.out.println("2.Comprar");
        System.out.println("3.Revisar consumo");
        System.out.println("Seleccione su opción:");
    }

    public static void choseOption() {
        System.out.println("Opción Inválida");
    }

    public static void menuWorker() {
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Seleccione su opción");
        System.out.println("1.Agregar productos a la tienda");
        System.out.println("2.Habitaciones");
        System.out.println("3.Ver productos de la tienda");
        System.out.println("Digite su opción: ");
    }

    public static void menuRoomChange() {
        System.out.println("1. Habilitar habitación");
        System.out.println("2. Disponibilidad de habitaciones");
        System.out.println("Seleccione opción: ");
    }

    public static void finalMessage() {
        System.out.println("Gracias por usar nuestro servicio electrónico.");
    }
}
