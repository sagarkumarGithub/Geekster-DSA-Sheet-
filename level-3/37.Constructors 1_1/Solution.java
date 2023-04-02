import java.io.*;
import java.util.*;

class Movies{
    int rating;
    int moneyCol;
    int profit;
    String leadActr;
    String leadActrs;

    Movies(int r, int monCol, int p, String actr, String actrs){
        this.rating = r;
        this.moneyCol = monCol;
        this.profit = p;
        this.leadActr = actr;
        this.leadActrs = actrs;
    }
    
    public void printDetails(){
        System.out.println(rating);
        System.out.println(moneyCol);
        System.out.println(profit);
        System.out.println(leadActr);
        System.out.println(leadActrs);
    }
}

public class Solution {

    public static void main(String[] args) {
        Movies batman1 = new Movies(8,200000,5000,"John","Disha");
        Movies batman2 = new Movies(9,500000,8000,"Akshay","Anushka");
        Movies batman3 = new Movies(10,700000,6000,"Ajay","Deepika");
        
        batman1.printDetails();
        batman2.printDetails();
        batman3.printDetails();
    }
}