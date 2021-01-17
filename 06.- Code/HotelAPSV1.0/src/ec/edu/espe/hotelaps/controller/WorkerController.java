/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.controller;

import com.google.gson.Gson;
import ec.edu.espe.hotelaps.model.Customer;
import ec.edu.espe.hotelaps.model.Worker;
import ec.edu.espe.hotelaps.view.WorkerView;
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
public class WorkerController {

    public Worker createWorker() {
        Scanner scanner = new Scanner(System.in);
        int idWorker = 1000;
        String firstName = null;
        String lastName = null;
        String documentNumber = null;
        String address = null;
        String telephone = null;
        String email = null;
        Boolean access = false;
        String password = null;
        String passwordSystem = "Admin";

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

        System.out.println("Ingrese contraseña: ");
        password = scanner.nextLine();

        if (password.equalsIgnoreCase(passwordSystem)) {
            access = true;
        }
        idWorker--;

        Worker worker = new Worker(idWorker, firstName, lastName, documentNumber, address, telephone, email, access, email, password);
        return worker;

    }

    public List<Worker> retrieveList() {

        ArrayList<Worker> workers = new ArrayList<>();
        try {
            FileReader f = new FileReader("worker.csv");
            BufferedReader b = new BufferedReader(f);

            Worker eachWorker;
            String lineFile;

            while ((lineFile = b.readLine()) != null) {
                String worker[] = lineFile.split(";");

                eachWorker = new Worker(Integer.valueOf(worker[0]), worker[1], worker[2], worker[3], worker[4], worker[5], worker[6], Boolean.valueOf(worker[7]), worker[8], worker[9]);
                workers.add(eachWorker);

            }

        } catch (IOException exception) {

        }
        return workers;

    }

    public boolean saveWorker(Worker worker) {
        List<Worker> workers = retrieveList();
        try {
            java.io.File txtFile = new java.io.File("workers.csv");

            workers.add(worker);

            if (!txtFile.exists()) {
                txtFile.createNewFile();
            }
            PrintWriter printer = new PrintWriter(new FileWriter(txtFile, false));

            for (Worker workerObject : workers) {
                printer.println(workerObject.toString());

            }
            printer.close();

        } catch (IOException ex) {
            System.err.println("Error, no se pudo guardar el archivo.");
            return false;

        }
        return true;

    }

    public void addNewWorker() {
        saveWorker(createWorker());
    }

    public void displayAnWorker(String lineOfFile) {

        Worker eachWorker = new Worker();
        Gson gson = new Gson();

        eachWorker = gson.fromJson(lineOfFile, Worker.class);
        WorkerView view = new WorkerView(eachWorker);
        view.display();
    }

    public Worker stringToWorker(String line) {
        String[] worker;
        worker = line.split(";");
        Worker eachWorker = new Worker();
        eachWorker = new Worker(Integer.valueOf(worker[0]), worker[1], worker[2], worker[3], worker[4], worker[5], worker[6], Boolean.valueOf(worker[7]), worker[8], worker[9]);
        return eachWorker;

    }

    public void displayWorker(String[] arrayOfString) {
        ArrayList<Worker> workers = new ArrayList<>();
        Gson gson = new Gson();
        for (String line : arrayOfString) {
            workers.add(gson.fromJson(line, Worker.class));
        }
        for (Worker worker : workers) {
            WorkerView view = new WorkerView(worker);
            view.display();
        }

    }
}
