/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;

import java.io.IOException;
import java.io.*;
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
    String username;
    String USER;
    String thing;
    String thing2;
    String password;
    String email;
    String newLocation;
    String newEmail;
    String THAT;
    boolean check = false;
    
    Scanner input = new Scanner(System.in);
    
    //createPost that = new createPost();
    
    
    //private final Path fFilePath =  Paths.get("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/" + username + ".txt");
    private final static Charset ENCODING = StandardCharsets.UTF_8;
    
    
    //read files with structured data
    public final void processLineByLine(String hats) throws IOException{
        //Path something = fFilePath;
        username = hats;
        //System.out.println(" LBL PATH USER = " + username);
        
        Path fFilePath2 =  Paths.get("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/" + username + ".txt");
        //System.out.println("PATH = " + fFilePath);
        try (Scanner scanner =  new Scanner(fFilePath2, ENCODING.name())){
            //System.out.println("processLBL try");
            while (scanner.hasNextLine()){
                //System.out.println("processLBL while");
                processLine(scanner.nextLine());
            }
        }
    }
    
    /**
    public String passUSER(String User){
        username = User;
        return username;
    }
    */
    
    //process lines
    protected void processLine(String aLine) throws IOException{
        Scanner scanner = new Scanner(aLine);
        scanner.useDelimiter(" = ");
        if (scanner.hasNext()){
            //asumes line has a certain structure
            //System.out.println("THING IS: " + thing);
            if (scanner.next().equals(thing)){
                thing2 = scanner.next();
                //System.out.println("THING 2: " + thing2);
                //check = true;
                
            }
            
            else {
                //System.out.println("processLine elseIN");
                if ( scanner.hasNextLine())
                    processLine(scanner.nextLine());
            }
            
        }
        
        
        else {
            int count = 0;
            if (count < 7){
                //log("Empty or invalid line. Unable to process.");
                count ++;
            }
            
            else{
                Menu in = new Menu();
                in.Menu();
            }
            
            /**
            System.out.println("No account exists, would you like to create one?");
            System.out.println("(Y or N)");
            String that = input.nextLine();
            
            if(that.equals("Y")){
                CreateAccount account = new CreateAccount();
                account.CreateAccount();
            }
            
            else {
                System.exit(0);
            }
            */
            
            
        }
        
    }
    
    //private final Path fFilePath =  Paths.get("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/" + username + ".txt");
    
    //private final static String fileName = "/twitterproject/dataFile.txt";
    
    private static void log(Object aObject){
        System.out.println(String.valueOf(aObject));
        
    }

    
    
    public String getUsername(String username) throws IOException{
        //System.out.println(" getUSERNAME = " + username);
        File f=  new File("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/" + username + ".txt");
        if (f.exists()){
            //passUSER(username);
            processLineByLine(username);
            //create.getU(username);
            THAT = username;
            return username;
        }
        
        else{
            System.out.println("No account with Username: " + username + " found.");
            System.out.println("Please create a new account.");
            Menu.Menu();
            return "NO DICE";
        }
        
        
        
        /**
        thing = "USER";
        processLineByLine();
        //System.out.println("THING 2: " + thing2);
        username = thing2;
        return username;
        */
    }
    
    
    public void setUsername(String newUsername){
        username = newUsername;
        thing = USER;
    }
       
       
    
    
    public String getPassword() throws IOException{
        //System.out.println("PASS: " + password);
        thing = "PASS";
        processLineByLine(username);
        //System.out.println("THING 2: " + thing2);
        password = thing2;
        return password;
        
    }
    
    public void setPassword(String newPassword){
        password = newPassword;
        System.out.println("NEW PASSWORD SET");
    }
    
    public String getEmail() throws IOException{
        thing = "EMAIL";
        processLineByLine(thing);
        //System.out.println("THING 2: " + thing2);
        email = thing2;
        return email;
    }
    
    public void setLocation(String location){
        newLocation = location;
        System.out.println("NEW LOCATION = " + newLocation);
    }

    public void setEmail(String email){
        newEmail = email;
        System.out.println("NEW EMAIL = " + newEmail);
    }

}
