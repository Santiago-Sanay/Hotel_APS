/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import ec.edu.espe.hotelaps.utils.Conection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jimmy Simbaña <your.name at your.org>
 */
public class Registry {

    Conection conection;
    BasicDBObject document;
    String selecteCollection;
    ArrayList<Person> listPerson;

    public Registry(String selecteCollection) {
        this.selecteCollection = selecteCollection;
        conection = new Conection("Persons", selecteCollection);
        document = new BasicDBObject();
        listPerson = new ArrayList();

    }

    public void createWorker(Worker worker) {

        document.append("name", worker.getName())
                .append("id", worker.getId())
                .append("login", worker.getLogin())
                .append("password", worker.getPassword())
                .append("access", worker.isAcces())
                .append("documentNumber", worker.getDocumentNumber())
                .append("telephone", worker.getTelephone())
                .append("email", worker.getEmail());
        conection.getCollection().insert(document);
    }

    public void createCustomer(Customer customer) {

        document.append("name", customer.getName())
                .append("id", customer.getId())
                .append("documentNumber", customer.getDocumentNumber())
                .append("telephone", customer.getTelephone())
                .append("email", customer.getEmail());
        conection.getCollection().insert(document);
    }

    public List<Person> readPerson() {
        DBCursor cursor = (DBCursor) conection.getCollection().find();
        while (cursor.hasNext()) {
            Person person = new Person((BasicDBObject) cursor.next());
            listPerson.add(person);
        }
        return listPerson;

    }

    public void updatePerson(Person person, String atribute) {
        document.put("id", atribute);
        DBCursor cursor = (DBCursor) conection.getCollection().find(document);
        while (cursor.hasNext()) {
            DBObject object = cursor.next();
            object.put("name", person.getName());
            object.put("id", person.getId());
            object.put("documentNumber", person.getDocumentNumber());
            object.put("telephone", person.getTelephone());
            object.put("email", person.getEmail());
            conection.getCollection().save(object);
        }
    }

    public void deletePerson(String atribute) {
        document.put("name", atribute);
        DBCursor cursor = (DBCursor) conection.getCollection().find(document);
        if (cursor.hasNext()) {
            DBObject object = cursor.next();
            conection.getCollection().remove(object);
        }

    }
    
    public String searchPerson(String name) {
        document.put("name", name);
        String neim = "";
        DBCursor cursor = (DBCursor) conection.getCollection().find(document);
        if (cursor.hasNext()) {
            DBObject object = cursor.next();
            neim = object.toString();
        }else{
            System.out.println("A");
        }
        return neim;
    }
    
    public void updateAdmins(String nameData, String newData, String oldData) {
       /* int ageOld;
        int ageNew;
        try {
            ageOld = Integer.parseInt(oldData);
            ageNew = Integer.parseInt(newData);
            Document findDocument = new Document(nameData, ageOld);
            Document updateDocument = new Document("$set", new Document(nameData, ageNew));
            adminDoc.findOneAndUpdate(findDocument, updateDocument);
        } catch (Exception e) {
            D
        }*/
    }
}
