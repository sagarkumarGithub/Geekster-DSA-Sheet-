import java.io.*;
import java.util.*;

class Movies{
        String name;
        int ratings;
        int moneyCol;
        int profit;
        String actor;
        String actress;
        
        //parametric constructor
        Movies(String n, int r, int mc, int p, String actor, String actress){
            this.name=n;
            this.ratings=r;
            this.moneyCol=mc;
            this.profit=p;
            this.actor=actor;
            this.actress=actress;
        }
    
        public void printDetails(){
            System.out.println(name);
            System.out.println(ratings);
            System.out.println(moneyCol);
            System.out.println(profit);
            System.out.println(actor);
            System.out.println(actress);
        }
        
}

public class Solution {
    
    public static void main(String[] args) {
        Movies batman1 = new Movies("Batman 1",8,200000,5000,"Rachel Gupta & Nikhil Chinapa","Disha");
        Movies batman2 = new Movies("Batman 2",9,500000,8000,"Rannvijay Singha & Prince Narula","Neha Dhupia");
        Movies batman3 = new Movies("Batman 3",10,700000,6000,"Rachel Gupta & Prince Narula","Neha Dhupia");
        
        batman1.printDetails();
        batman2.printDetails();
        batman3.printDetails();
}
}