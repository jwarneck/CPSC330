/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;

import java.io.FileReader;
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
    String filename = "/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/dataFile.txt";
    
    
    
    Scanner input = new Scanner(System.in); 
    
    public void CreateAccount() throws IOException{
        setFirstName();
        setLastName();
        setEmail();
        setLocation();
        setDateJoined();
        setUsername();
        setPassword();
        
        Login LoginMenu = new Login();
        LoginMenu.Login();
    }
    
    //Set User's first name
    public void setFirstName(){
    
        System.out.println("Please enter your First Name.");
        firstName = input.nextLine();
    }
    
    //Set User's Last Name
    public void setLastName(){
        
        System.out.println("Please enter your Last Name.");
        lastName = input.nextLine();
    
    }
    
    //Set User's Email address
    public void setEmail(){
        
        System.out.println("Please enter your Email Address.");
        email = input.nextLine();
    
    }
    
    //Set Location of User
    public void setLocation(){
        
        System.out.println("Please enter where you are located.");
        location = input.nextLine();
    
    }
    
    //Set Date Joined
    public void setDateJoined(){
        
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        dateJoined = dateFormat.format(cal.getTime());
        
    }
    
    //Set Password
    public void setPassword(){
        System.out.println("Please enter the password you'd like to use.");
        password = input.nextLine();
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
