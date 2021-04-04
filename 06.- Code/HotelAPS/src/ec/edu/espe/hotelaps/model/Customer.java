/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;
import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class Customer extends Person {

    public Customer(String name, String id, String documentNumber, String telephone, String email) {
        super(name, id, documentNumber, telephone, email);
    }

}
