/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Shop {

    private ArrayList<Product> products;
    Gson gson = new Gson();

    @Override
    public String toString() {
        return "Shop{" + "products=" + getProducts() + '}';
    }

    public Shop() {
        products = new ArrayList();
    }

    /**
     * @return the products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        String jsonProduct = gson.toJson(product, Product.class);
        FileManager.save("inventoryShop.json", jsonProduct);
    }
    public void showAllProducts(){
        String [] roomsFree = FileManager.findAll("inventoryShop.json");
        for (String roomsFree1 : roomsFree) {
            System.out.println(roomsFree1 );
        }
    }
    public String findProduct(String nameProduct){
        String roomsFree = FileManager.find("inventoryShop.json",nameProduct);        
        return roomsFree;
    }
 
}
