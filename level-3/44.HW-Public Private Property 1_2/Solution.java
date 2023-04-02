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
    
    private int calculateGrade(int views, int likes){
        int finalGrade=10*likes + views;
        return finalGrade;
    }
    
    public void printGrade(){
        int finalGrade = calculateGrade(this.views,this.likes);
        System.out.println(finalGrade);
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
        obj.printGrade();
    }
}