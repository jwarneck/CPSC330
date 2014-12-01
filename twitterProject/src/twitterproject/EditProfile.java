/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author jordanwarnecke
 */
public class EditProfile {
    String newUsername;
    String newPassword;
    String newLocation;
    String newEmail;
    String choice;
    boolean USER = true;
    Scanner input = new Scanner(System.in);
    String username;
    String password;
    String location;
    String email;
    String joined;
    String first;
    String last;
    
    User set = new User();
    User get = new User();
    private String newLast;
    private String newFirst;
    
    
    public void EditProfile(String thisEmail, String thisJoined,String thisFirst, String thisLast, String thisLocation, String thisUser, String thisPass) throws IOException{
        email = thisEmail;
    	joined = thisJoined;
    	first = thisFirst;
    	last = thisLast;
    	location = thisLocation;
    	username = thisUser;
    	password = thisPass;
        
        editMenu();
    }
    
    public void changeName () throws FileNotFoundException, IOException{
        System.out.println("Change First or Last name? ");
        System.out.println("Enter 'F' for first, 'L' for last. ");
        choice = input.nextLine().toUpperCase();
        
        if ("F".equals(choice)){
            System.out.println("Enter your new first name: ");
            newFirst = input.nextLine();
            //PrintWriter writer = new PrintWriter("C:/Users/User/Desktop/dataFile.txt");
            PrintWriter writer = new PrintWriter("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/UserData/" + username + ".txt");
            writer.print("");
            writer.close();

        
            //try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/User/Desktop/dataFile.txt", true)))) {
            try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/UserData/" + username + ".txt", true)))) {
                out.println("USER : " + username);
                out.println("PASS : " + password);
                out.println("FIRST : " + newFirst);
                out.println("LAST : " + last);
                out.println("EMAIL : " + email);
                out.println("LOC : " + location);
                out.println("DJ : " + joined);
        
        
            }catch (IOException e) {
                    }
            
            set.setFirst(newFirst);
        }
        
        else if ("L".equals(choice)){
            System.out.println("Enter your new last name: ");
            newLast = input.nextLine();
            //PrintWriter writer = new PrintWriter("C:/Users/User/Desktop/dataFile.txt");
            PrintWriter writer = new PrintWriter("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/UserData/" + username + ".txt");
            writer.print("");
            writer.close();

        
            //try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/User/Desktop/dataFile.txt", true)))) {
            try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/UserData/" + username + ".txt", true)))) {
                out.println("USER : " + username);
                out.println("PASS : " + password);
                out.println("FIRST : " + first);
                out.println("LAST : " + newLast);
                out.println("EMAIL : " + email);
                out.println("LOC : " + location);
                out.println("DJ : " + joined);
        
        
            }catch (IOException e) {
                    }
            
            set.setLast(newLast);
            
        }
        
        else {
            System.out.println("Invalid input, try again.");
            changeName();
        }
        
    }
    
    public void changePassword () throws FileNotFoundException, IOException{
        System.out.println("Enter your new password: ");
        newPassword = input.nextLine();
        //PrintWriter writer = new PrintWriter("C:/Users/User/Desktop/dataFile.txt");
        PrintWriter writer = new PrintWriter("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/UserData/" + username + ".txt");
        writer.print("");
        writer.close();

        
        //try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/User/Desktop/dataFile.txt", true)))) {
    	try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/UserData/" + username + ".txt", true)))) {
            out.println("USER : " + username);
    	    out.println("PASS : " + newPassword);
    	    out.println("FIRST : " + first);
    	    out.println("LAST : " + last);
    	    out.println("EMAIL : " + email);
    	    out.println("LOC : " + location);
    	    out.println("DJ : " + joined);
        
        
    	}catch (IOException e) {
        	}
        
        set.setPassword(newPassword);
    }
    
    public void changeLocation () throws FileNotFoundException, IOException{
        System.out.println("Enter your new location: ");
        newLocation = input.nextLine();
        //PrintWriter writer = new PrintWriter("C:/Users/User/Desktop/dataFile.txt");
        PrintWriter writer = new PrintWriter("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/UserData/" + username + ".txt");
        writer.print("");
        writer.close();
        
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/UserData/" + username + ".txt", true)))) {
            //try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/User/Desktop/dataFile.txt", true)))) {
    	    out.println("USER : " + username);
    	    out.println("PASS : " + password);
    	    out.println("FIRST : " + first);
    	    out.println("LAST : " + last);
    	    out.println("EMAIL : " + email);
    	    out.println("LOC : " + newLocation);
    	    out.println("DJ : " + joined);
        
        
    	}catch (IOException e) {
        	}
        
        set.setLocation(newLocation);
    }
    
    public void changeEmail () throws FileNotFoundException, IOException{
        System.out.println("Enter your new email: ");
        newEmail = input.nextLine();
        //PrintWriter writer = new PrintWriter("C:/Users/User/Desktop/dataFile.txt");
        PrintWriter writer = new PrintWriter("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/UserData/" + username + ".txt");
        writer.print("");
        writer.close();
        
         try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/UserData/" + username + ".txt", true)))) {
        //try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/User/Desktop/dataFile.txt", true)))) {
    	    out.println("USER : " + username);
    	    out.println("PASS : " + password);
    	    out.println("FIRST : " + first);
    	    out.println("LAST : " + last);
    	    out.println("EMAIL : " + newEmail);
    	    out.println("LOC : " + location);
    	    out.println("DJ : " + joined);
        
        
    	}catch (IOException e) {
        	}
        set.setEmail(newEmail);
    }

    public void editMenu() throws IOException{
        System.out.println("");
        System.out.println("");
        System.out.println("Please choose an option below: ");
        System.out.println("");
        System.out.println("1: Change Name");
        System.out.println("2: Change Password");
        System.out.println("3: Change Location");
        System.out.println("4: Change Email Address");
        System.out.println("5: Back to profile menu");
        System.out.println("6: Log out and exit");
        System.out.println("");
        choice = input.nextLine();
        
        if (choice.equals("1")){
            System.out.println("Change Name");
            changeName();
        }
        
        else if (choice.equals("2")){
            System.out.println("Change Password");
            changePassword();
            
        }
        
        else if (choice.equals("3")){
            System.out.println("Change Location");
            changeLocation();
            
        }
        
        else if (choice.equals("4")){
            System.out.println("Change Email Address");
            changeEmail();
            
        }
        
        else if (choice.equals("5")){
            System.out.println("Login menu");
            Login LoginMenu = new Login();
            LoginMenu.loginMenu();
            
        }
        
        else if (choice.equals("6")){
            System.out.println("Logged out ");
            System.exit(0);
            
        }
        
        else{
            System.out.println("Invalid selection, please try again.");
            editMenu();
        }
    }
    
}
