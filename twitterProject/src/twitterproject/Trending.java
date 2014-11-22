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
    private ArrayList hashtags;
    
    public Trending(){
        hashtags = new ArrayList();
    }
    
    public void addHashtag (Hashtag hashtag) {
        hashtags.add(hashtag);
        
    }
    
    public void showTrending(){
        //print out lsit of tweets with trending hashtags
    }
}

