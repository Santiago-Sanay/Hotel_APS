/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import ec.edu.espe.filemanager.utils.FileManager;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class Consumption {

    public Consumption() {
    }


    public void showAllComsumtion(String name) {
        String[] roomsFree = FileManager.findAll(name+".json");
        for (String roomsFree1 : roomsFree) {
            System.out.println(roomsFree1);
       }
        
    }
}
