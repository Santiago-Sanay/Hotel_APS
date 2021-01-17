/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.controller;

import com.google.gson.Gson;
import ec.edu.espe.hotelaps.model.Customer;
import ec.edu.espe.hotelaps.view.CustomerView;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class CustomerController {

    public Customer createCustomer() {
        Scanner scanner = new Scanner(System.in);
        int idCustomer = 0;
        String firstName = "";
        String lastName = "";
        String documentNumber = "";
        String address = "";
        String telephone = "";
        String email = "";

        System.out.println("Ingrese nombre: ");
        firstName = scanner.nextLine();
        System.out.println("Ingrese apellido: ");
        lastName = scanner.nextLine();

        do {
            System.out.println("Ingrese C.I: ");
            documentNumber = scanner.nextLine();
        } while (documentNumber.length() < 1 && documentNumber.length() > 10);

        System.out.println("Ingrese direccion : ");
        address = scanner.nextLine();

        System.out.println("Ingrese número de teléfono: ");
        telephone = scanner.nextLine();

        System.out.println("Ingrese email: ");
        email = scanner.nextLine();

        idCustomer++;

        Customer student = new Customer(idCustomer, firstName, lastName, documentNumber, address, telephone, email);

        return student;

    }

    public List<Customer> retrieveList() {

        ArrayList<Customer> customers = new ArrayList<>();
        try {
            FileReader f = new FileReader("customer.csv");
            BufferedReader b = new BufferedReader(f);

            Customer eachCustomer;
            String lineFile;

            while ((lineFile = b.readLine()) != null) {
                String customer[] = lineFile.split(";");

                eachCustomer = new Customer(Integer.valueOf(customer[0]), customer[1], customer[2], customer[3], customer[4], customer[5], customer[6]);

                customers.add(eachCustomer);

            }

        } catch (IOException exception) {

        }
        return customers;

    }

    public boolean saveCustomer(Customer customer) {
        List<Customer> customers = retrieveList();
        try {
            java.io.File txtFile = new java.io.File("customers.csv");

            customers.add(customer);

            if (!txtFile.exists()) {
                txtFile.createNewFile();
            }
            PrintWriter printer = new PrintWriter(new FileWriter(txtFile, false));

            for (Customer customerObject : customers) {
                printer.println(customerObject.toString());

            }
            printer.close();

        } catch (IOException ex) {
            System.err.println("Error, no se pudo guardar el archivo.");
            return false;

        }
        return true;

    }

    public void addNewCustomer() {
        saveCustomer(createCustomer());
    }

    public void displayAnCustomer(String lineOfFile) {

        Customer eachCustomer = new Customer();
        Gson gson = new Gson();

        eachCustomer = gson.fromJson(lineOfFile, Customer.class);
        CustomerView view = new CustomerView(eachCustomer);
        view.display();
    }

    public Customer stringToCustomer(String line) {
        String[] customer;
        customer = line.split(";");
        Customer eachCustomer = new Customer();
        eachCustomer = new Customer(Integer.valueOf(customer[0]), customer[1], customer[2], customer[3], customer[4], customer[5], customer[6]);
        return eachCustomer;

    }

    public void displayCustomer(String[] arrayOfString) {
        ArrayList<Customer> customers = new ArrayList<>();
        Gson gson = new Gson();
        for (String line : arrayOfString) {
            customers.add(gson.fromJson(line, Customer.class));
        }
        for (Customer customer : customers) {
            CustomerView view = new CustomerView(customer);
            view.display();
        }

    }

}
