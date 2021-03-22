/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.utils;

/**
 *
 * @author Jimmy Simbaña <your.name at your.org>
 */
public interface Persistence {
    boolean save(String data, String table);
    boolean update(String dataToFind, String newData,String table);
    String find(String dataToFind, String table);
    boolean delete(String dataToFind, String table);
    String read(String table);
}
