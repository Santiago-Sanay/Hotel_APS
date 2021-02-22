/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jimmy Simbaña <your.name at your.org>
 */
public class RegistrationPerson {

    Conection conection;
    BasicDBObject document;
    ArrayList<Person> listPerson;
    

    public RegistrationPerson() {
        conection = new Conection();
        document = new BasicDBObject();
        listPerson = new ArrayList();

    }

    public void createPerson(Person person) {

        document.append("name", person.getName())
                .append("id", person.getId())
                .append("documentNumber", person.getDocumentNumber())
                .append("telephone", person.getTelephone())
                .append("email", person.getEmail());
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
        DBCursor cursor =  (DBCursor) conection.getCollection().find(document);
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

}
