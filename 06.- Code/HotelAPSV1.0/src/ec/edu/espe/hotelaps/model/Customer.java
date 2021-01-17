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
public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String documentNumber;
    private String address;
    private String telephone;
    private String email;

    public Customer() {
        id = 0;
        firstName = "name";
        lastName = "lastName";
        documentNumber = "1725634785";
        email = "proof@espe.edu.ec";
        address = "calle,numero de casa";
        telephone = "0999999999";
    }

    @Override
    public String toString() {
        return "Customer{" + ", " + id + ", " + firstName + ", " + lastName + ", " + documentNumber + ", " + address + ", " + telephone + ", " + email + '}';
    }

    public Customer(int id, String firstName, String lastName, String documentNumber, String address, String telephone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public Reservation doReservation() {

        Reservation reservation = new Reservation();
        return reservation;
    }

    public void seeConsumption() {

    }

    public boolean pay() {
        return false;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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

}
