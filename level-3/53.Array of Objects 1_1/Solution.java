import java.io.*;
import java.util.*;

class movies{
    String name;
    int rating;
    int monCol;
    int profit;
    String actor;
    String actress;
    
    movies(String n,int r, int mc, int p, String actr, String actrs){
        this.name=n;
        this.rating=r;
        this.monCol=mc;
        this.profit=p;
        this.actor=actr;
        this.actress=actrs;
    }
    
    public void printDetails(){
        System.out.println(name);
        System.out.println(rating);
        System.out.println(monCol);
        System.out.println(profit);
        System.out.println(actor);
        System.out.println(actress);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        movies[] arr = new movies[n];
        
        for(int i=0; i<n; i++){
            String name = scn.nextLine();
            int rating = scn.nextInt();
            int profit = scn.nextInt();
            int monCol = scn.nextInt();
            scn.nextLine();
            String actor = scn.nextLine();
            String actress = scn.nextLine();
            
            movies obj = new movies(name,rating,profit,monCol,actor,actress);
            arr[i] = obj;
        }
        
        for(int i=0; i<n; i++){
            movies obj = arr[i];
            obj.printDetails();
        }
    }
}