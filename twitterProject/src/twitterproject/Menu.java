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
        
        System.out.println(" ");
        System.out.println("Please choose an option below:");
        System.out.println("");
        System.out.println("1: Login");
        System.out.println("2: Create Account");
        System.out.println("3: View messages");
        System.out.println("4: Quit");
        
        choice = input.nextLine();
        if (choice.equals("1")){
            Login newLogin = new Login();
            newLogin.Login1();
        }
        
        else if (choice.equals("2")){

            CreateAccount newAccount = new CreateAccount();
            newAccount.CreateAccount();
           
            
        }
        
        else if (choice.equals("3")){
            System.out.println("Message list");
            System.out.println(" ");
            
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
            
        }
        /**
        else if (choice.equals("4")){
            System.out.println("View Trending");
            Trending newTrend = new Trending();
            newTrend.Trending();
            
        }
        */
        else if (choice.equals("4")){
            System.exit(0);
        }
        
        else {
            System.out.println("Invalid choice, please try again.");
            Menu();
        }
            
        
        
    }
}
