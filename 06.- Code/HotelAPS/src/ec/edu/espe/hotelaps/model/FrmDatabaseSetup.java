/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.model;

import com.mongodb.client.MongoDatabase;
import ec.edu.espe.dbmanager.MongoDB;

/**
 *
 * @author Alvaro Vera
 */
public class FrmDatabaseSetup {
    MongoDB mongoDB = MongoDB.getInstance();
    public static MongoDatabase database = MongoDB.conecction();    
}
