/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    String thing3 = "-";
    String password;
    String email;
    int check = 0;
    
    
    
    //read files with structured data
    public final void processLineByLine() throws IOException{
        try (Scanner scanner =  new Scanner(fFilePath, ENCODING.name())){
            //System.out.println("processLBL try");
            while (scanner.hasNextLine()){
                //System.out.println("processLBL while");
                processLine(scanner.nextLine());
            }
        }
    }
    
    //process lines
    protected void processLine(String aLine){
        Scanner scanner = new Scanner(aLine);
        scanner.useDelimiter(" = ");
        //while (!scanner.next().equals(thing3)){
        if (scanner.hasNext()){
            //asumes line has a certain structure
            System.out.println("THING IS: " + thing);
            if (scanner.next().equals(thing)){
                thing2 = scanner.next();
                //check = true;
                System.out.println("THING 2: " + thing2);
                
            }
            else {
                System.out.println("processLine elseIN");
                if ( scanner.hasNextLine())
                    processLine(scanner.nextLine());
            }
            
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
    
    
    
    
    public String getUsername() throws IOException{
        
        thing = "USER";
        processLineByLine();
        //System.out.println("THING 2: " + thing2);
        username = thing2;
        return username;
        
    }
    
    public void setUsername(String newUsername){
        username = newUsername;
        thing = USER;
        
       
    }
    
    public String getPassword() throws IOException{
        
        thing = "PASS";
        processLineByLine();
        //System.out.println("THING 2: " + thing2);
        password = thing2;
        return password;
        
    }
    
    public void setPassword(String newPassword){
        //password = newPassword;
    }
    
    public String getEmail() throws IOException{
        thing = "EMAIL";
        processLineByLine();
        //System.out.println("THING 2: " + thing2);
        email = thing2;
        return email;
    }
}
