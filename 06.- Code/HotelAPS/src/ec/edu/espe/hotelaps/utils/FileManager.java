/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hotelaps.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jimmy Simbaña <your.name at your.org>
 */
public class FileManager implements Persistence{

    @Override
    public boolean save(String data, String table) {
     boolean saved = false;
        try {
            File file = new File(table + ".txt");
            if(file.createNewFile()){
                saved = true;
                
            }else{
                saved = false;
            }
                try{
                    FileWriter myWrite = new FileWriter(table + ".txt");
                    myWrite.write(data);
                    myWrite.close();
                    saved = false;
                } catch (IOException ex){
                    ex.printStackTrace();
                    saved = false;
                }
        } catch (IOException ex){
            ex.printStackTrace();
            saved = false;
        }
        return saved;
    }

    @Override
    public boolean update(String dataToFind, String newData, String table) {
        return false;
    }

    @Override
    public String find(String dataToFind, String table) {
         return null;
    }

    @Override
    public boolean delete(String dataToFind, String table) {
         return false;
    }

    @Override
    public String read(String table) {
        return null;
    }
    
}
