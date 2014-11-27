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
    
    String author;
    String datePosted;
    String message;
    String messageShown;
    int charCount;
    int numFav;
    int numRP;
    String hashtag;
    String otherUsers;
    
    Scanner input = new Scanner(System.in);
    
    public void createPost(){
        setMessage();
        charLimit();
        postMessage();
    }
    
    public void setMessage(){
        System.out.println("Type your message, or 1 to cancel. message must be under 140 characters: ");
        message = input.nextLine();
        cancelPost();
        charLimit();
        if (message.equals("1")) {
        	cancelPost();
        }
        postMessage();
        
        
    }
    
    public void postMessage(){
    	//author = account.getUsername();
    	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        datePosted = dateFormat.format(cal.getTime());
        
        
        
    	message = "Author: " + author + " : " + message + " [Favourited: 0]" + "[Reposted: 0]";

    	try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/User/Desktop/dataFile.txt", true)))) {
    	    out.println(message);
    	}catch (IOException e) {
        	}
    	
    	
    	
        
    }
    
    public void cancelPost(){
        //Login newLogin = new Login();
        //newLogin.loginMenu();
    }
    
    public void charLimit(){
    	charCount = message.length();
        if (charCount > 140){
            setMessage();
        }
    }
    public void findPost(){
    	    String filePath = "C:/Users/User/Desktop/dataFile.txt";
    	    BufferedReader br;
    	    String inputSearch = "Author:" + author;
    	    String line = "";

    	    try {
    	        br = new BufferedReader(new FileReader(filePath));
    	        try {
    	            while((line = br.readLine()) != null)
    	            {
    	                //System.out.println(line);
    	                String[] words = line.split(" ");

    	                for (String word : words) {
    	                  if (word.equals(inputSearch)) {
    	                	  System.out.println(word + " ");
    	                  }
    	                }

    	            }
    	            br.close();
    	        } catch (IOException e) {
    	            
    	            e.printStackTrace();
    	        }
    	    } catch (FileNotFoundException e) {
    	        
    	        e.printStackTrace();
    	    }

    	}

    }
