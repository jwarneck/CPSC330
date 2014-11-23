/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterproject;

import java.util.*;
        

/**
 *
 * @author jordanwarnecke
 */
public class Trending {
    private ArrayList hashtags = new ArrayList();
    
    public void Trending(){
        for (int i = 0; i < hashtags.size(); i++){
            System.out.print(hashtags);
        }
    }
    
    public void addHashtag (Hashtag hashtag) {
        hashtags.add(hashtag);
        
    }
    
    public void showHashtag(String hashtag){
        System.out.println("Seraching messages with Hashtag: " + hashtag);
        
        //print out lsit of tweets with a certain hashtag
    }
}

