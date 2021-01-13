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
    Date timeStay;
    int hosted;

    public Customer(String name, String email, String id, Date timeStay, int hosted) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.timeStay = timeStay;
        this.hosted = hosted;
    }

    public Customer(String name, String email, String id, String timeStay, int hosted) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", email=" + email + ", id=" + id + ", timeStay=" + timeStay + ", hosted=" + hosted + '}';
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

    public Date getTimeStay() {
        return timeStay;
    }

    public void setTimeStay(Date timeStay) {
        this.timeStay = timeStay;
    }

    public int getHosted() {
        return hosted;
    }

    public void setHosted(int hosted) {
        this.hosted = hosted;
    }

    }
