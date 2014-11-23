/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jordanwarnecke
 */


public class User {
    String username = "jwarneck";
    String USER;
    String thing;
    String thing2;
    
    
    
    //read files with structured data
    public final void processLineByLine() throws IOException{
        try (Scanner scanner =  new Scanner(fFilePath, ENCODING.name())){
            System.out.println("processLBL try");
            while (scanner.hasNextLine()){
                System.out.println("processLBL while");
                processLine(scanner.nextLine());
            }
        }
    }
    
    //process lines
    protected void processLine(String aLine){
        Scanner scanner = new Scanner(aLine);
        scanner.useDelimiter("=");
        if (scanner.hasNext()){
            //asumes line has a certain structure
            System.out.println("THING IS: " + thing);
           if (scanner.next().equals(thing)){
                thing2 = scanner.next();
                
            }
           else {
               System.out.println("processLline elseIN");
               processLine(scanner.nextLine());
           }
            //String name = scanner.next();
            //String value = scanner.next();
            //log("Name is: " + quote(name.trim()) + ", and Value is: " + quote(value.trim()));
        }
        
        else {
            log("Empty or invalid line. Unable to process.");
        }
    }
    
    private final Path fFilePath =  Paths.get("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/dataFile.txt");
    private final static Charset ENCODING = StandardCharsets.UTF_8;
    
    private static void log(Object aObject){
        System.out.println(String.valueOf(aObject));
        
    }
    
    private String quote(String aText){
        String QUOTE = " ' ";
        return QUOTE + aText + QUOTE;
    }
    
    
    
    
    public String getUsername() throws IOException{
        //username = "jwarneck";
        thing = "USER";
        processLineByLine();
        System.out.println("THING 2: " + thing2);
        return thing2;
        
    }
    
    public void setUsername(String newUsername){
        username = newUsername;
        thing = USER;
        
       
    }
    
    public String getPassword(){
        String password = "1234";
        return password;
    }
    
    public void setPassword(String newPassword){
        //password = newPassword;
    }
}
