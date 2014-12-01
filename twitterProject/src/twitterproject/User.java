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
    String location;
    String first;
    String last;
    String joined;
    String THAT;
    boolean check = false;
    
    Scanner input = new Scanner(System.in);
    
    
    
    
    
    
    //private final Path fFilePath =  Paths.get("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/" + username + ".txt");
    private final static Charset ENCODING = StandardCharsets.UTF_8;
    
    
    //read files with structured data
    public final void processLineByLine(String hats) throws IOException{
        //Path something = fFilePath;
        username = hats;
        System.out.println(" LBL PATH USER = " + username);
        
        Path fFilePath2 =  Paths.get("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/UserData/" + username + ".txt");
        //System.out.println("PATH = " + fFilePath2);
        try (Scanner scanner =  new Scanner(fFilePath2, ENCODING.name())){
            System.out.println("processLBL try");
            while (scanner.hasNextLine()){
                System.out.println("processLBL while");
                processLine(scanner.nextLine());
            }
        }
    }
    
    
    //process lines
    protected void processLine(String aLine) throws IOException{
        Scanner scanner = new Scanner(aLine);
        scanner.useDelimiter(" : ");
        if (scanner.hasNext()){
            //asumes line has a certain structure
            //System.out.println("THING IS: " + thing);
            if (scanner.next().equals(thing)){
                thing2 = scanner.next();
                //System.out.println("THING 2: " + thing2);
                //check = true;
                
            }
            
            else {
                System.out.println("processLine elseIN");
                if ( scanner.hasNextLine())
                    processLine(scanner.nextLine());
            }
            
        }
        
        
        else {
            int count = 0;
            if (count < 15){
                //log("Empty or invalid line. Unable to process.");
                count ++;
            }
            
            else{
                Menu in = new Menu();
                in.Menu();
            }
            
            
        }
        
    }
    
    //private final Path fFilePath =  Paths.get("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/" + username + ".txt");
    
    //private final static String fileName = "/twitterproject/dataFile.txt";
    
    private static void log(Object aObject){
        System.out.println(String.valueOf(aObject));
        
    }

    
    
    public String getUsername(String username) throws IOException{
        //System.out.println(" getUSERNAME = " + username);
        File f=  new File("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/UserData/" + username + ".txt");
        if (f.exists()){
            
            processLineByLine(username);
            
            return username;
        }
        
        else{
            System.out.println("No account with Username: " + username + " found.");
            System.out.println("Please create a new account.");
            Menu.Menu();
            return "NO DICE";
        }
        

    }

    public String getU(){
        THAT = thing;
        return THAT;
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
    
    public void setPassword(String newPassword) throws IOException{
        password = newPassword;
        System.out.println("NEW PASSWORD SET");
        Login some = new Login();
        some.loginMenu();
    }
    
    public String getEmail() throws IOException{
        thing = "EMAIL";
        processLineByLine(username);
        //System.out.println("THING 2: " + thing2);
        email = thing2;
        Login some = new Login();
        some.loginMenu();
        return email;
    }
    
    public void setLocation(String location) throws IOException{
        newLocation = location;
        System.out.println("NEW LOCATION = " + newLocation);
        Login some = new Login();
        some.loginMenu();
    }

    public void setEmail(String email) throws IOException{
        newEmail = email;
        System.out.println("NEW EMAIL = " + newEmail);
        Login some = new Login();
        some.loginMenu();
    }
    
    public String getLocation() throws IOException{
    	thing = "LOC";
    	processLineByLine(username);
    	location = thing2;
    	return location;
    }
    public String getFirst() throws IOException{
    	thing = "FIRST";
    	processLineByLine(username);
    	first = thing2;
    	return first;
    }
    public String getLast() throws IOException{
    	thing = "LAST";
    	processLineByLine(username);
    	last = thing2;
    	return last;
    }
    public String getJoined() throws IOException{
    	thing = "DJ";
    	processLineByLine(username);
    	joined = thing2;
    	return joined;
    }
}
