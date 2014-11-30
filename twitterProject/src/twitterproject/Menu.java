/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;

import java.io.IOException;
import java.io.*;
import java.util.*;

/**
 *
 * @author jordanwarnecke
 */
public class Menu {
        public static void Menu() throws IOException{
            
        File file = new File("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/messages.txt");
        
            
        Scanner input = new Scanner(System.in);
        String choice;
        
        System.out.println("Welcome to the CPSC department Message Board");
        System.out.println("Please choose an option below:");
        System.out.println("");
        System.out.println("1: Login");
        System.out.println("2: Create Account");
        System.out.println("3: View messages");
        //System.out.println("4: View trending messages");
        System.out.println("4: Quit");
        
        choice = input.nextLine();
        if (choice.equals("1")){
            //System.out.println("Login");
            Login newLogin = new Login();
            newLogin.Login1();
        }
        
        else if (choice.equals("2")){
            
            System.out.println("Create Account");
            
            CreateAccount newAccount = new CreateAccount();
            newAccount.CreateAccount();
           
            
        }
        
        else if (choice.equals("3")){
            System.out.println("Message list");
            
            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()){
                    String line = sc.nextLine();
                    System.out.println(line);
                }
                sc.close();
            }
            
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            
            // print all recent stored messages
            // set limit to print n messages?
        }
        /**
        else if (choice.equals("4")){
            System.out.println("View Trending");
            Trending newTrend = new Trending();
            newTrend.Trending();
            
        }
        */
        else if (choice.equals("4")){
            //System.out.println("Logged out successfully.");
            System.exit(0);
        }
        
        else {
            System.out.println("Invalid choice, please try again.");
            Menu();
        }
            
        
        
    }
}
