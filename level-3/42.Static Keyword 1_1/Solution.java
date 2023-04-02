import java.io.*;
import java.util.*;

class Movies{
    String name;
    int ratings;
    int monCol;
    int profit;
    String actr;
    String actrs;
    
    static String videoType = "movies";
    
    Movies(int r, int m, int p, String actr, String actrs){
        this.ratings=r;
        this.monCol=m;
        this.profit=p;
        this.actr=actr;
        this.actrs=actrs;
    }
}

public class Solution {

    public static void main(String[] args) {
        Movies superman1 = new Movies(8,900000,8000,"Rachel Gupta","Vaani");
        System.out.println(superman1.videoType);
        System.out.println(Movies.videoType);
    }
}