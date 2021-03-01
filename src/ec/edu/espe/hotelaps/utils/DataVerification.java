/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.utils;

import ec.edu.espe.hotelaps.model.Authentication;
import java.util.Scanner;

/**
 *
 * @author SSS SANTIAGO
 */
public class DataVerification {

    public static String custumer() {
        String nameSearch = "";
        Scanner scanner = new Scanner(System.in);
        boolean verify;
        do {
            scanner.nextLine();
            System.out.println("Ingrese el nombre que registro: ");
            nameSearch = scanner.nextLine();

            Authentication authentication;
            authentication = new Authentication(nameSearch);
            verify = authentication.authenticateCustomer();

        } while (verify == false);

        MainMenu.menuCustomer();
        return nameSearch;
    }

}
