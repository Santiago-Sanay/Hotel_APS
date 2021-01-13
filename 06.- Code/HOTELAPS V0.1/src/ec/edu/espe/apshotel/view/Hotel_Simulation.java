/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.apshotel.view;

import ec.edu.espe.apshotel.controller.UserController;
import java.util.Scanner;

/**
 *
 * @author SSS SANTIAGO
 */
public class Hotel_Simulation {
    
    public static void main(String[] args) {
        UserController controller = new UserController();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1: crear usuario");
            System.out.println("2: Mostrar todos los usuarios");
            System.out.println("3: salir");
            System.out.print("Ingrese la opcion: ");
            
            try {
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception ex) {
                option = -1;
            }
            
            if (option == -1) continue;
            
            System.out.println();
            System.out.println();
            
            if (option == 1) {
                controller.addUser();
            } else if (option == 2) {
                controller.showAllUsers();
            }
            
            System.out.println();
            System.out.println();
        } while (option != 3);
    }
    
}
