/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.ArrayList;
import java.util.List;

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

    public void printAllProduct() {
        FileManager.findAll("inventoryShop.json");
        List<Product> products1;
        products1 = new ArrayList();
        String[] product;
        product = FileManager.findAll("inventoryShop.json");
        Product eachProduct;
        for (String line : product) {
            eachProduct = gson.fromJson(line, Product.class);
            products1.add(eachProduct);
        }
        System.out.println("Precio Nombre del producto");
        for (Product product1 : products1) {
            System.out.println(product1.toString());
            product1.toString();
        }
    }

    public String findProduct(String nameProduct) {
        String roomsFree = FileManager.find("inventoryShop.json", nameProduct);
        return roomsFree;
    }

    public void updateStock(String nameProduct, Product product) {
        String stringJson;
        FileManager.delete("inventoryShop.json", nameProduct);
        stringJson = gson.toJson(product);

        FileManager.save("inventoryShop.json", stringJson);
    }
}
