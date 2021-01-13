/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.apshotel.model;

import java.sql.Date;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Customer {
    String name;
    String email;
    String id;
    String timeStay;
    int hosted;

    public Customer(String name, String email, String id, String timeStay, int hosted) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.timeStay = timeStay;
        this.hosted = hosted;
    }

    @Override
    public String toString() {
        return "Datos del Clienter-->" + "   Nombre=" + name + ", Email=" + email + ", Id=" + id + ", Tiempo de Estadia=" + timeStay + ",Cantiadad de Uusuarios=" + hosted + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimeStay() {
        return timeStay;
    }

    public void setTimeStay(String timeStay) {
        this.timeStay = timeStay;
    }

    public int getHosted() {
        return hosted;
    }

    public void setHosted(int hosted) {
        this.hosted = hosted;
    }

}
