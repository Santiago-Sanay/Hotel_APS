/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 * @author Jimmy Simbaña
 */
public class Person {

    private String name;
    private String id;
    private String documentNumber;
    private String telephone;
    private String email;


    public Person(String name, String id, String documentNumber, String telephone, String email) {
        this.name = name;
        this.id = id;
        this.documentNumber = documentNumber;
        this.telephone = telephone;
        this.email = email;
    }
    

    public Person(BasicDBObject object) {
        
        name = object.getString("name");
        id = object.getString("id");
        documentNumber = object.getString("documentNumber");
        telephone= object.getString("telephone");
        email = object.getString("email");
    }
    
    

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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
    
     @Override
    public String toString() {
        return "Person{" + getName() + getId() + getDocumentNumber() + getTelephone() + getEmail() + '}';
    }

}
