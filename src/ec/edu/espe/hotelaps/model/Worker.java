/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Worker extends Person {

    private String login;
    private String password;
    private boolean acces;

    public Worker(String login, String password, boolean acces, String name, String id, String documentNumber, String telephone, String email) {
        super(name, id, documentNumber, telephone, email);
        this.login = login;
        this.password = password;
        this.acces = acces;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() + "login=" + login + ", password=" + password + ", acces=" + acces + '}';
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the acces
     */
    public boolean isAcces() {
        return acces;
    }

    /**
     * @param acces the acces to set
     */
    public void setAcces(boolean acces) {
        this.acces = acces;
    }

}
