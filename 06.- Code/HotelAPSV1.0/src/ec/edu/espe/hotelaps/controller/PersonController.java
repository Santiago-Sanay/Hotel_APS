/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.controller;

import com.google.gson.Gson;

/**
 *
 * @author Jimmy Simbaña <your.name at your.org>
 */
public class PersonController {
    
    
    public Person createPerson(){
        Scanner scanner=new Scanner(System.in);
        
        int opcion = 0;
        
        
        do{
            
        System.out.println("Bienvenido a Hotel APS");
        System.out.println("Escoga la opcion de usuario");
        System.out.println("1. Cliente");
        System.out.println("2. Trabajador");
        System.out.println("Seleccione Opción"); 
        
        opcion = scanner.nextInt();
        scanner.nextLine();
        }while(opcion < 1 && opcion > 2);
  
        switch(opcion){
            case 1:
                
                 System.out.println("Bienvenido al registro del Cliente");
                 System.out.println("Ingrese el Nombre:");
                break;
                
            case 2:
                
                
                break;
        }
       
    }
}
    

