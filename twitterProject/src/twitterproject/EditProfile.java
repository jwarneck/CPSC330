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
public class EditProfile {
    String newUsername;
    String newPassword;
    String newLocation;
    String newEmail;
    boolean USER = true;
    
    public void changeUsername (String username){
        //user enters new desired username
        //bool statement checking username
        if (USER == true){
            username = newUsername;
        }
        else
            System.out.println("Username already in use, please try again.");
        
    }
    
    public void changePassword (String password){
        password = newPassword;
    }
}
