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
public class createPost {
    
    String author;
    int datePosted;
    String messsage;
    int charCount;
    int numFav;
    int numRP;
    String hashtag;
    String otherUsers;
    
    public void postMessage(){
        //user posts a message
    }
    
    public void cancelPost(){
        //user can cancel posting
    }
    
    public boolean charLimit(){
        if (charCount > 150){
            return false;
        }
        else
            return true;
    }
}
