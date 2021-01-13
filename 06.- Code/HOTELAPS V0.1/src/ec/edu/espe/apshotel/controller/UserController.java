/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.apshotel.controller;
import ec.edu.espe.apshotel.model.Customer;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SSS SANTIAGO
 */
public class UserController {

    public UserController() {
        try {
            File file = new File("users.csv");
        
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception exception) {
            System.out.println("Error: no se pudo crear el archivo users.txt");
        }
    }
    
    public Customer createUser(){
        
         Scanner scanner = new Scanner(System.in);
         String name;
         String email;
         String id;
         String timeStay;
         int hosted;
         
         System.out.println("Ingrese su nombre y apellido");
         name = scanner.nextLine();
         System.out.println("Ingrese su email");
         email = scanner.nextLine();
         System.out.println("Ingrese su id");
         id = scanner.nextLine();
         System.out.println("Ingrese fecha de hospedaje YY-MM-DD");
         timeStay = scanner.nextLine();
         System.out.println("Ingrese numero de personas");
         hosted = scanner.nextInt();
         /* scanner.nextLine();*/
         Customer user = new Customer(name, email, id, timeStay, hosted);
         return user;
    }
    
    public void addUser(){
        Customer user = createUser();
        Path filePath = Paths.get("users.csv");
        
        try {
            String linea = user.toString() + "\n";
            Files.write(filePath, linea.getBytes(), StandardOpenOption.APPEND);
        } catch (Exception exception) {
            System.out.println("Error: Cannot write to file '" + exception.getMessage() + "'");
        }
    }
    
  
    public void showAllUsers() {
        try {
            Path filePath = Paths.get("users.csv");
            List<String> lines =  Files.readAllLines(filePath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception exception) {
            System.out.println("Error: No se pudo leer el fichero" );
        }
    }
}


