/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;

import java.io.IOException;
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
    
    User set = new User();
    User get = new User();
    
    
    public void EditProfile() throws IOException{
        editMenu();
    }
    
    public void changeUsername (String username){
        //user enters new desired username
        //bool statement checking username
        
        
        if (USER == true){
            username = newUsername;
            
            set.setUsername(username);
        }
        else
            System.out.println("Username already in use, please try again.");
        
    }
    
    public void changePassword (String password){
        password = newPassword;
        set.setPassword(newPassword);
    }
    
    public void changeLocation (String location){
        location = newLocation;
    }
    
    public void changeEmail (String email){
        email = newEmail;
    }

    public void editMenu() throws IOException{
        System.out.println("Please choose an option below: ");
        System.out.println("");
        System.out.println("1: Change User Name");
        System.out.println("2: Change Password");
        System.out.println("3: Change Location");
        System.out.println("4: Change Email Address");
        System.out.println("5: Back to profile menu");
        System.out.println("6: Log out and exit");
        System.out.println("");
        choice = input.nextLine();
        
        if (choice.equals("1")){
            System.out.println("Change Username");
            //changeUsername(username);
        }
        
        else if (choice.equals("2")){
            System.out.println("Change Password");
            
        }
        
        else if (choice.equals("3")){
            System.out.println("Change Location");
            
        }
        
        else if (choice.equals("4")){
            System.out.println("Change Email Address");
            
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
