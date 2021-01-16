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
public class Customer {
    
    private Person idPerson;
    private String customerCode;

    @Override
    public String toString() {
        return "Customer{" + "idPerson=" + idPerson + ", customerCode=" + customerCode + '}';
    }

    public Customer(Person idPerson, String customerCode) {
        this.idPerson = idPerson;
        this.customerCode = customerCode;
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
     * @return the customerCode
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * @param customerCode the customerCode to set
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }
    
}
