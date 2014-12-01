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
    String email;
    String location;
    String first;
    String last;
    String joined;
    String someone;
    //String msgFile = "/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/messages.txt";
    String msgFile = "C:/Users/User/Desktop/twitterproject/src/twitterproject/messages.txt";
    boolean check, check2 = false;
    //File file = new File("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/messages.txt");
    File file = new File("C:/Users/User/Desktop/twitterproject/src/twitterproject/messages.txt");
    User use = new User();
    
    
    
    BufferedReader br;

    
    
    public void Login1() throws IOException{
        System.out.println("");
        System.out.println("Please enter your User Name:");
        user = input.nextLine();
        while (check == false){
            if (user.equals(use.getUsername(user))){
                check = true;
            }
            
            //JAMES' CODE
            //File f = new File("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/UserData/" + user + ".txt");
            File f = new File("C:/Users/User/Desktop/CPSC330/twitterProject/src/twitterproject/UserData/" + user + ".txt");
            if(f.exists()){}
            else{
                Menu.Menu();
            }
            
            
        }
        System.out.println("Please enter your password:");
        pass = input.nextLine();
        while (check2 == false){
            if (pass.equals(use.getPassword())){
                check2 = true;
            }
            
            else{
                System.out.println("Incorrect password, please try again.");
                Login1();
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
        System.out.println("3: View a user's messages");
        //System.out.println("-: View hashtag");
        System.out.println("4: View recent messages");
        System.out.println("5: Logout and Return to main menu");
        System.out.println("");
        choice = input.nextLine();
        
        if (choice.equals("1")){
            
            email = use.getEmail();
            location = use.getLocation();
            first = use.getFirst();
            last = use.getLast();
            joined = use.getJoined();
            
            EditProfile account = new EditProfile();
            account.EditProfile(email, joined, first, last, location, user, pass);
            account.editMenu();
        }
        
        else if (choice.equals("2")){
            System.out.println("post new");
            createPost post = new createPost();
            post.createPost(user);
            
        }
        
        else if (choice.equals("3")){
            System.out.println("What user's messages would you like to see?");
            someone = input.nextLine();
            createPost view = new createPost();
            view.findPost(someone);
            
            
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
