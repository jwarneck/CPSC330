/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.*;
import java.util.*;

/**
 *
 * @author jordanwarnecke
 */
public class CreateAccount {
    
    String firstName;
    String lastName;
    String email;
    String location;
    String dateJoined;
    String username;
    String password;
    String filename = "/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/dataFile.txt";
    BufferedWriter writer;
    
    
    
    Scanner input = new Scanner(System.in); 

    public CreateAccount() throws IOException {
        this.writer = new BufferedWriter(new FileWriter(filename));
    }
    
    public void CreateAccount() throws IOException{
        
        writer.write("\n");
        setFirstName();
        setLastName();
        setEmail();
        setLocation();
        setDateJoined();
        setUsername();
        setPassword();
        writer.close();
        
        Login LoginMenu = new Login();
        LoginMenu.Login1();
    }
    
    //Set User's first name
    public void setFirstName() throws IOException{
    
        System.out.println("Please enter your First Name.");
        firstName = input.nextLine();
        writer.write("FIRST = " + firstName);
        writer.newLine();
        
    }
    
    //Set User's Last Name
    public void setLastName() throws IOException{
        
        System.out.println("Please enter your Last Name.");
        lastName = input.nextLine();
        writer.write("LAST = " + lastName);
        writer.newLine();
    
    }
    
    //Set User's Email address
    public void setEmail() throws IOException{
        
        System.out.println("Please enter your Email Address.");
        email = input.nextLine();
        writer.write("EMAIL = " + email);
        writer.newLine();
    
    }
    
    //Set Location of User
    public void setLocation() throws IOException{
        
        System.out.println("Please enter where you are located.");
        location = input.nextLine();
        writer.write("LOC = " + location);
        writer.newLine();
    
    }
    
    //Set Date Joined
    public void setDateJoined() throws IOException{
        
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        dateJoined = dateFormat.format(cal.getTime());
        writer.write("DJ = " + dateJoined);
        writer.newLine();
        
    }
    
    //Set Password
    public void setPassword() throws IOException{
        System.out.println("Please enter the password you'd like to use.");
        password = input.nextLine();
        writer.write("PASS = " + password);
        writer.newLine();
    }
    
    //Set Username
    public void setUsername() throws IOException {
        
        System.out.println("Please enter the Username you'd like to have.");
        username = input.nextLine();
        boolean check = checkUsername(username);
        if (check == true) {
            System.out.println("Username already in use, please try again.");
            setUsername();
        } 
        else {
            writer.write("USER = " + username);
            writer.newLine();
            System.out.println("Your username is: " + username);
        }
        
        
    }
    
    //Check if Username is available
    public boolean checkUsername(String username)throws IOException{
        
        String check = readFile(filename);
        System.out.println("CHECK: " + check + " USERNAME: " + username);
        if (check.equals(username)) {
            return true;
        }
        else
            return false;
            //return true;
               
    }
    
    public String readFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        try{
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            
            while (line != null) {
                line = br.readLine();
                sb.append(line);
                sb.append("\n");
                //line = br.readLine();
                
            }
            
            String THIS = sb.toString();
            System.out.println("");
            System.out.println("print SB");
            System.out.println(THIS);
            
            return sb.toString();
        }
        finally {
            br.close();
        }
    }
}
