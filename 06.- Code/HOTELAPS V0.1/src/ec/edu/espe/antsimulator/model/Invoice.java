/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model;

import java.util.Date;

/**
 *
 * @author Gabriel Rosero ESPE-DCCO
 */
public class Invoice {
    
    int numberAcount;
    int iva;
    Date date;
    Customer customer;
    Payment payment;
}
