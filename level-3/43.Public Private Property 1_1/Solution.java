import java.io.*;
import java.util.*;

class Movies{
    public String name;
    public int ratings;
    public int monCol;
    public int profit;
    public String actr;
    public String actrs;
    private int likes;
    private int views;
    
    public void displayLikes(){
        System.out.println(likes);
    }
    
    public void displayViews(){
        System.out.println(views);
    }
    
    Movies(String n,int r, int monCol, int pro, String actr, String actrs, int likes, int views){
        this.name=n;
        this.ratings=r;
        this.monCol=monCol;
        this.profit=pro;
        this.actr=actr;
        this.actrs=actrs;
        this.likes=likes;
        this.views=views;
    }   
}

public class Solution {

    public static void main(String[] args) {
        Movies obj = new Movies("Superman 1",8,90000,1000,"Rachel Gupta and Prince Narula","Aarushi",500,10000);
        
        System.out.println(obj.ratings);
        System.out.println(obj.monCol);
        System.out.println(obj.profit);
        System.out.println(obj.actr);
        System.out.println(obj.actrs);
        obj.displayViews();
        obj.displayLikes();
    }
}