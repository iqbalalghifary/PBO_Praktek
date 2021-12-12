/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author ikbalalghifary
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Gson gson = new Gson();
        try{
            Reader reader = Files.newBufferedReader(Paths.get("F://Coretan Java//W2//PBO_Praktek//W12 - Prak//src//week12//barang.json"));
            ArrayList<Barang> barangs = gson.fromJson(reader, new TypeToken<ArrayList<Barang>>() {}.getType());

            for(Barang barang:barangs)
            {
                System.out.println(barang.printOutput());
            }
           
                    
        }
        catch(NoSuchFileException exc){
            System.out.println("File Not Found ");
        }
    }
    
}
