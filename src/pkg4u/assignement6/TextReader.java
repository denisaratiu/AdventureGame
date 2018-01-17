package pkg4u.assignement6;


import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haynal
 */
public class TextReader {
    public Image readFile(String fileName){
        
        //read the file
        FileReader file = null;
        
        //try to create a new file reader with name of the passed in file
        try{
            file = new FileReader(fileName);
            // excpetion 
        }catch (FileNotFoundException ex){
            Logger.getLogger(TextReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
