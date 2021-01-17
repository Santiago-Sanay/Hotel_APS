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

    private int idWorker;
    private String firstName;
    private String lastName;
    private String documentNumber;
    private String address;
    private String telephone;
    private String email;
    private boolean access;
    private String login;
    private String password;

    public Worker(int idWorker, String firstName, String lastName, String documentNumber, String address, String telephone, String email, Boolean access, String login, String password) {
        this.idWorker = idWorker;
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.access = access;
        this.login = login;
        this.password = password;
    }

    public Worker() {
        idWorker = 0;
        firstName=null;
        lastName=null;
        documentNumber=null;
        address=null;
        telephone=null;
        email=null;
        access=true;
        password=null;
    }

    @Override
    public String toString() {
        return "Trabajador{" + idWorker + ", " + firstName + ", " + lastName + ", " + documentNumber + ", " + address + ", " + telephone + ", " + email + ", " + isAccess() + ", " + login + ", " + password + '}';
    }

    /**
     * @return the idWorker
     */
    public int getIdWorker() {
        return idWorker;
    }

    /**
     * @param idWorker the idWorker to set
     */
    public void setIdWorker(int idWorker) {
        this.idWorker = idWorker;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public boolean getAccess() {
        return isAccess();
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

    /**
     * @return the access
     */
    public boolean isAccess() {
        return access;
    }


}
