/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;


/**
 *
 * @author jordanwarnecke
 */
public class Login {

    
    private void Login(){
        
        User.getUserame();
        User.getPassword();
    }
    
    public void loginMenu(){
        System.out.println("Please choose an option below: ");
        System.out.println("1: Edit Account Info");
        System.out.println("2: Post a new message");
        System.out.println("3: View trending messages");
        System.out.println("4: View messages");
        System.out.println("5: Logout and exit");
    }
    
}
