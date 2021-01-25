/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author SANTIAGO SSS
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

    public void printAllProduct() {

        FileManager.findAll("inventoryShop.json");
        ArrayList<Product> products1 = new ArrayList();
        String[] productsString;
        productsString = FileManager.findAll("inventoryShop.json");
        
        System.out.println("Cantidad  3Precio  Nombre del producto ");
        System.out.println("**************************************");
        for (int i = 0; i < productsString.length; i++) {
            products1.add(gson.fromJson(productsString[i], Product.class));
            System.out.println(products1.get(i));
        }
    }

    public String findProduct(String nameProduct) {
        String product = FileManager.find("inventoryShop.json", nameProduct);
        return product;
    }

    public void showAvailableProduct(String dataToFind) {
        String dataOfFile;
        String[] dataFile;
        try {

            dataOfFile = FileManager.find("inventoryShop.json", dataToFind);
            dataFile = dataOfFile.split("\n");
            ArrayList<Product> availableProduct = new ArrayList();

            for (int i = 0; i < dataFile.length; i++) {
                availableProduct.add(gson.fromJson(dataFile[i], Product.class));
                System.out.println(availableProduct.get(i));
            }
        } catch (Exception ex) {
            System.out.println("No hay productos disponibles");
        }

    }

    public void updateStock(String nameProduct, Product product) {
        String stringJson;
        FileManager.delete("inventoryShop.json", nameProduct);
        stringJson = gson.toJson(product);

        FileManager.save("inventoryShop.json", stringJson);
    }
}
