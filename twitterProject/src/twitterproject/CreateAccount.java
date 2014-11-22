/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;

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
    
    
    Scanner fileInput = new Scanner(new File("dataFile.txt"));
    Scanner input = new Scanner(System.in); 
    
    public void CreateAccount(){
        //constructor stuff
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
    
    //Set Username
    public void setUsername() {
        
        System.out.println("Please enter the Username you'd like to have.");
        username = input.nextLine();
        
        if (!checkUsername(username)){
            System.out.println("Unfortunately that Username is already in use.");
            System.out.println("Please try another Username.");
            username = input.nextLine();
        }
        
    }
    
    //Check if Username is available
    public boolean checkUsername(String username) {
        List UserNames = new ArrayList();
        

        while (UserNames != null) {
            //check list of Usernames stored in the txt file
        }
        
        return false;
    }
}
