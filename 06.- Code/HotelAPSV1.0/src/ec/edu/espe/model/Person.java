/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Person {
    
    private int idPerson;
    private String firstName;
    private String lastName;
    private String documentNumber;
    private String address;
    private String telephone;
    private String email;

    @Override
    public String toString() {
        return "Person{" + "idPerson=" + idPerson + ", firstName=" + firstName + ", lastName=" + lastName + ", documentNumber=" + documentNumber + ", address=" + address + ", telephone=" + telephone + ", email=" + email + '}';
    }

    public Person(int idPerson, String firstName, String lastName, String documentNumber, String address, String telephone, String email) {
        this.idPerson = idPerson;
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    /**
     * @return the idPerson
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * @param idPerson the idPerson to set
     */
    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
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
