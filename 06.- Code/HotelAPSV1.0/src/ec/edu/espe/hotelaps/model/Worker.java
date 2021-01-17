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
public class Worker {
    
    private Person idPerson;
    private String access;
    private String login;
    private String password;
    private String status;

    @Override
    public String toString() {
        return "Worker{" + "idPerson=" + idPerson + ", access=" + access + ", login=" + login + ", password=" + password + ", status=" + status + '}';
    }

    public Worker(Person idPerson, String access, String login, String password, String status) {
        this.idPerson = idPerson;
        this.access = access;
        this.login = login;
        this.password = password;
        this.status = status;
    }

    /**
     * @return the idPerson
     */
    public Person getIdPerson() {
        return idPerson;
    }

    /**
     * @param idPerson the idPerson to set
     */
    public void setIdPerson(Person idPerson) {
        this.idPerson = idPerson;
    }

    /**
     * @return the access
     */
    public String getAccess() {
        return access;
    }

    /**
     * @param access the access to set
     */
    public void setAccess(String access) {
        this.access = access;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void checkIn(Reservation reservation){
        
    }
    
    public void checkOut(Reservation reservation){
        
    }
    
   
}
