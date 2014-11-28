/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;

import java.io.IOException;
import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.*;
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
    String msgFile = "/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/messages.txt";
    boolean check, check2 = false;
    File file = new File("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/messages.txt");
    User use = new User();
    
    BufferedReader br;

    /**
    public Login() {
        try {
            this.br = new BufferedReader(new FileReader(msgFile));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    **/
    
    public void Login1() throws IOException{
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
        
        /**
        else {
            System.out.println("No account exists, would you like to create one?");
            System.out.println("(Y or N)");
            String that = input.nextLine();
            
            if(that.equals("Y")){
                CreateAccount account = new CreateAccount();
                account.CreateAccount();
            }
            
            else {
                System.exit(0);
            }
        }
        */
        
        
    }
    
    public void loginMenu() throws IOException {
        System.out.println("Please choose an option below: ");
        System.out.println("");
        System.out.println("1: Edit Account Info");
        System.out.println("2: Post a new message");
        System.out.println("3: View trending messages");
        System.out.println("-: View hashtag");
        System.out.println("4: View recent messages");
        System.out.println("5: Logout and Return to main menu");
        System.out.println("");
        choice = input.nextLine();
        
        if (choice.equals("1")){
            EditProfile account = new EditProfile();
            account.EditProfile();
        }
        
        else if (choice.equals("2")){
            System.out.println("post new");
            createPost post = new createPost();
            post.createPost();
            
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
            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()){
                    String line = sc.nextLine();
                    System.out.println(line);
                }
                sc.close();
            }
            
            catch (FileNotFoundException e) {
            }
            System.out.println(" ");
            loginMenu();
            
            
        }
        
        else if (choice.equals("5")){
            System.out.println("Logged out");
            Menu menu = new Menu();
            menu.Menu();
            
        }
        
        else{
            System.out.println("Invalid selection, please try again.");
            loginMenu();
        }
        
    }
    
}
