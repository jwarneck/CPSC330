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
import java.io.PrintWriter;
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
    String filename = "/C:/Users/User/Desktop/dataFile.txt";
    BufferedWriter writer;
    String whole;
    
    
    
    Scanner input = new Scanner(System.in); 

    
    public void CreateAccount() throws IOException{
        
        
        
        setFirstName();
        setLastName();
        setEmail();
        setLocation();
        setDateJoined();
        setUsername();
        setPassword();
        //writer.write("\n" + whole);
        
        Login LoginMenu = new Login();
        LoginMenu.Login1();
    }
    
    //Set User's first name
    public void setFirstName() throws IOException{
    
        System.out.println("Please enter your First Name.");
        firstName = input.nextLine();
        firstName = "FIRST = " + firstName;
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/C:/Users/User/Desktop/dataFile.txt", true)))) {
    	    out.println(firstName);
        
        
    	}catch (IOException e) {
        	}
        
    }
    
    //Set User's Last Name
    public void setLastName() throws IOException{
        
        System.out.println("Please enter your Last Name.");
        lastName = input.nextLine();
        lastName = "LAST = " + lastName;
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/C:/Users/User/Desktop/dataFile.txt", true)))) {
    	    out.println(lastName);
        
        
    	}catch (IOException e) {
        	}
    
    }
    
    //Set User's Email address
    public void setEmail() throws IOException{
        
        System.out.println("Please enter your Email Address.");
        email = input.nextLine();
        email = "EMAIL = " + email;
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/C:/Users/User/Desktop/dataFile.txt", true)))) {
    	    out.println(email);
        
        
    	}catch (IOException e) {
        	}
    
    }
    
    //Set Location of User
    public void setLocation() throws IOException{
        
        System.out.println("Please enter where you are located.");
        location = input.nextLine();
        location = "LOC = " + location;
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/C:/Users/User/Desktop/dataFile.txt", true)))) {
    	    out.println(location);
        
        
    	}catch (IOException e) {
        	}
    
    }
    
    //Set Date Joined
    public void setDateJoined() throws IOException{
        
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        dateJoined = dateFormat.format(cal.getTime());
        dateJoined = "DJ = " + dateJoined;
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/C:/Users/User/Desktop/dataFile.txt", true)))) {
    	    out.println(dateJoined);
        
        
    	}catch (IOException e) {
        	}
        
    }
    
    //Set Password
    public void setPassword() throws IOException{
        System.out.println("Please enter the password you'd like to use.");
        password = input.nextLine();
        password = "PASS = " + password;
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/C:/Users/User/Desktop/dataFile.txt", true)))) {
    	    out.println(password);
        
        
    	}catch (IOException e) {
        	}
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
        	username = "USER = " + username;
            try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/C:/Users/User/Desktop/dataFile.txt", true)))) {
        	    out.println(username);
            
            
        	}catch (IOException e) {
            	}
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
                //whole = line;
                
            }
            
            //String THIS = sb.toString();
            //System.out.println("");
            //System.out.println("print SB");
            //System.out.println(THIS);
            
            return sb.toString();
        }
        finally {
            br.close();
        }
    }
    
}
