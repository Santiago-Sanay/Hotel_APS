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
public class Service {

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    public Service(float price, String type) {
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Service{" + "price=" + price + ", type=" + type + '}';
    }
    

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    private float price;
    private String type;
    
    public int sell (int quaity){
       
        
    }
    
    public void ring (Product product){
        
    }
}
