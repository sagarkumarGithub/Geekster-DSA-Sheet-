import java.io.*;
import java.util.*;

class Movies{
    String name;
    int ratings;
    int monCol;
    int profit;
    String actr;
    String actrs;
    
    Movies(int r, int m, int p, String actr, String actrs){
        System.out.println("Lead actor has the main role.");
    }
    
    Movies(String actrs, String actr, int r, int m, int p){
        System.out.println("Lead actress has the main role.");
    }
}

public class Solution {

    public static void main(String[] args) {
        Movies superman1 = new Movies(8, 900000,8000, "Rachel Gupta","Disha");
        Movies superman2 = new Movies("Vaani Gupta", "Prince Narula",9, 1900000,28000);
    }
}