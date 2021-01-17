/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.view;

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
            System.out.println("Escoja la opción de usuario");
            System.out.println("1. Cliente");
            System.out.println("2. Trabajador");
            System.out.println("Seleccione opción: ");
            opc = scanner.nextInt();
            scanner.nextLine();
        } while (opc < 1 && opc > 2);
        switch (opc) {
            case 1:

                System.out.println("Bienvenido al registro del Cliente");
                break;

            case 2:

                break;
        }

    }

}
