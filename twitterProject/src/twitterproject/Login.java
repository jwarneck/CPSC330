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
public class Login {

    Scanner input = new Scanner(System.in);
    String choice;
    String user;
    String pass;
    boolean check, check2 = false;
    
    User use = new User();
    
    
    public void Login() throws IOException{
        System.out.println("");
        System.out.println("Please enter your User Name:");
        user = input.nextLine();
        while (check == false){
            if (user.equals(use.getUsername())){
                check = true;
            }
        }
        System.out.println("Please enter your password:");
        pass = input.nextLine();
        while (check2 == false){
            if (pass.equals(use.getPassword())){
                check2 = true;
            }
        }
        
        if ((check == true) && (check2 == true)){
            loginMenu();
        }
        
        
    }
    
    public void loginMenu() throws IOException {
        System.out.println("Please choose an option below: ");
        System.out.println("");
        System.out.println("1: Edit Account Info");
        System.out.println("2: Post a new message");
        System.out.println("3: View trending messages");
        System.out.println("-: View hashtag");
        System.out.println("4: View recent messages");
        System.out.println("5: Logout and exit");
        System.out.println("");
        choice = input.nextLine();
        
        if (choice.equals("1")){
            EditProfile account = new EditProfile();
            account.EditProfile();
        }
        
        else if (choice.equals("2")){
            System.out.println("post new");
            
        }
        
        else if (choice.equals("3")){
            System.out.println("view trending");
            
        }
        
        else if (choice.equals("-")){
            System.out.println("view hashtag");
            System.out.println("");
            System.out.println("Enter hashtag to search for");
            
            String hashSearch = input.nextLine();
            
            Trending hash = new Trending();
            hash.showHashtag(hashSearch);
            
        }
        
        else if (choice.equals("4")){
            System.out.println("view recent messages");
            
        }
        
        else if (choice.equals("5")){
            System.out.println("Logged out");
            System.exit(0);
            
        }
        
        else{
            System.out.println("Invalid selection, please try again.");
            loginMenu();
        }
        
    }
    
}
