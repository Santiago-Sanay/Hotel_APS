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
public class Product {
        public void setBrand(String brand) {
        this.brand = brand;
    }
    
    private int id;
    private float price;
    private String name;
    private String brand;
    
    public int sell(int quality){
        
       int total=0;
       return total;
    }

    public Product(int id, float price, String name, String brand) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", price=" + price + ", name=" + name + ", brand=" + brand + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */

}
