/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author jordanwarnecke
 */
public class createPost {
    
    //String author;
    String datePosted;
    String message;
    String messageShown;
    int charCount;
    int numFav;
    int numRP;
    String hashtag;
    String otherUsers;
    
    Scanner input = new Scanner(System.in);
    Login test = new Login();
    User stuff = new User();
    String author;
    
    
    public void createPost(String username) throws IOException{
        this.author = username;
        //System.out.println("AUTHOR: " + author);
        //System.out.println("CREATE POST");
        setMessage();

    }
    
    public void setMessage() throws IOException{
        
        System.out.println("Type your message, or 1 to cancel. Message must be under 140 characters: ");
        message = input.nextLine();
        
        charLimit();
        if (message.equals("1")) {
            System.out.println("MESSAGE CANCELLED");
            cancelPost();
        }
        
        else if (charCount > 140){
            
            System.out.println("");
            System.out.println("Message is too long, please reduce length to ");
            System.out.println("less than 140 characters.");
            System.out.println("");
            setMessage();
        
        }
        
        else {
            postMessage();
            System.out.println("");
            System.out.println("Message posted successfully! Returning to main menu.");
            System.out.println("");
            test.Login1();
        
        }
        
        
    }
    
    public void postMessage(){
    	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        datePosted = dateFormat.format(cal.getTime());
        
        
    	//String POST = "Author: " + this.author + " Date Posted: " + datePosted + "\n" + "Message: " + message +  "[ Favourited: 0]" + " [Reposted: 0]" + "\n";

        String POST = "Author: " + this.author + " Date Posted: " + datePosted + "\n" + "Message: " + message + "\n";
        
        //System.out.println(POST);
        
    	try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/jordanwarnecke/GitHub/CPSC330/twitterProject/src/twitterproject/messages.txt", true)))) {
    	    out.println(POST);
            
            //try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/User/Desktop/twitterproject/src/twitterproject/messages.txt", true)))) {
    	    //out.println(message);
        
        
    	}catch (IOException e) {
        	}
    	
    	
    	
        
    }
    
    public void cancelPost() throws IOException{
        Login newLogin = new Login();
        newLogin.loginMenu();
    }
    
    public void charLimit(){
    	charCount = message.length();
        
    }
    public void findPost(String findIt) throws IOException{
    	    String filePath = "/Users/jordanwarnecke/GitHub/CPSC330/twitterproject/src/twitterproject/messages.txt";
            //String filePath = "C:/Users/User/Desktop/twitterproject/src/twitterproject/messages.txt";
    	    BufferedReader br;
    	    String inputSearch = "Author: " + findIt;
    	    String line = " ";
            //System.out.println("findPost()");
           // System.out.println("inputSearch = " + inputSearch);

    	    try {
    	        br = new BufferedReader(new FileReader(filePath));
                //System.out.println("TRY1");
    	        try {
                    //System.out.println("TRY2");
    	            //while(((line = br.readLine()) != null) && (line.startsWith("Author: " + inputSearch)))
                    while ((line = br.readLine()) != null) {
                        
    	                String[] words = line.split(" ");
                        //System.out.println("LINE = " + line);
                        System.out.println(line);

    	                for (String word : words) {
                            //System.out.println("FOR WORD in WORDS" + word);
    	                  if (word.startsWith(inputSearch)) {
                            System.out.println("WORD = " + word + " ");
    	                  }
    	                }

    	            }
    	            br.close();
                    Login go = new Login();
                    go.Login1();
    	        } catch (IOException e) {
    	            
    	            //e.printStackTrace();
    	        }
    	    } catch (FileNotFoundException e) {
    	        
    	        //e.printStackTrace();
    	    }
            
            Login go = new Login();
            go.Login1();
            
    	}

    }
