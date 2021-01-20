/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class Worker {

    private String idWorker;
    private String name;
    private String documentNumber;
    private String address;
    private String telephone;
    private String email;
    private boolean access;
    private String login;
    private String password;

    @Override
    public String toString() {
        return "Worker{" + "idWorker=" + idWorker + ", name=" + name + ", documentNumber=" + documentNumber + ", address=" + address + ", telephone=" + telephone + ", email=" + email + ", access=" + access + ", login=" + login + ", password=" + password + '}';
    }

    public Worker(String idWorker, String name, String documentNumber, String address, String telephone, String email, boolean access, String login, String password) {
        this.idWorker = idWorker;
        this.name = name;
        this.documentNumber = documentNumber;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.access = access;
        this.login = login;
        this.password = password;
    }

    /**
     * @return the idWorker
     */
    public String getIdWorker() {
        return idWorker;
    }

    /**
     * @param idWorker the idWorker to set
     */
    public void setIdWorker(String idWorker) {
        this.idWorker = idWorker;
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
     * @return the documentNumber
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * @param documentNumber the documentNumber to set
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the access
     */
    public boolean isAccess() {
        return access;
    }

    /**
     * @param access the access to set
     */
    public void setAccess(boolean access) {
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

    
}
