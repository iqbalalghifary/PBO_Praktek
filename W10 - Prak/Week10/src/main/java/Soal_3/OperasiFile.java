/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 *
 * @author imdex
 */
public class OperasiFile {
    public static void main(String[] args) {
        File file = new File("F://5.1//pbo10//file123.txt");
        try{
            // Following file does not exist
            FileReader fr = new FileReader(file);
            System.out.println("File nya ada ketemu kang!");
        } catch (FileNotFoundException e) {
           System.out.println("File kaga ditemukan!");
        }
    }
}
