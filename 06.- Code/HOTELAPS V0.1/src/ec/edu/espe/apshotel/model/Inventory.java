/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.apshotel.model;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Inventory {

    /**
     * @return the exit
     */
    public int getExit() {
        return exit;
    }

    /**
     * @param exit the exit to set
     */
    public void setExit(int exit) {
        this.exit = exit;
    }

    /**
     * @return the entry
     */
    public int getEntry() {
        return entry;
    }

    /**
     * @param entry the entry to set
     */
    public void setEntry(int entry) {
        this.entry = entry;
    }
    
    public int code;
    public int stock;
    private int exit;
    private int entry;
    public String description;
    public String name;
    
    public void add (int stock, int entry, Product product){
        
    }
    
    public void remove (int stock, int exit, Product product){
        
    }
    
}