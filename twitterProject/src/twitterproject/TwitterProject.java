/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;

import java.util.*;

/**
 *
 * @author jordanwarnecke
 */



public class TwitterProject {
    
    Scanner input = new Scanner(System.in);
    String choice;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu();
    }
    
    public void Menu(){
        System.out.println("Welcome to the CPSC department Message Board");
        System.out.println("Please choose an option below:");
        System.out.println("1: Login");
        System.out.println("2: Create Account");
        System.out.println("3: View messages");
        System.out.println("4: View trending messages");
        System.out.println("5: Quit");
        
        choice = input.nextLine();
        if (choice == "1"){
            Login.loginMenu();
        }
        
        else if (choice == "2"){
            CreateAccount.setFirstName();
            CreateAccount.setLastName();
            CreateAccount.setLocation();
            CreateAccount.setEmail();
            CreateAccount.setDateJoined();
            
        }
        
        else if (choice == "3"){
            // print all recent stored messages
            // set limit to print n messages?
        }
        
        else if (choice == "4"){
            // print trending messages
        }
        
        else if (choice == "5"){
            return;
        }
        
        else {
            System.out.println("Invalid choice, please try again.");
        }
            
        
        
    }
}
