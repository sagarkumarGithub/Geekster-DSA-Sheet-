import java.io.*;
import java.util.*;

class movies{
    String name;
    int rating;
    int moneyCollection;
    int profit;
    String leadActor;
    String leadActress;
    
    public void displayRating(){
        System.out.println(rating);
        System.out.println("This is the function of movies class");
    }
}

class commercialMovies extends movies{
    int views;
    int likes;
    
    public void displayRating(){
        System.out.println(rating);
        System.out.println("This is the function of the commercial movies class.");
    }
}

public class Solution {

    public static void main(String[] args) {
        commercialMovies obj = new commercialMovies();
        obj.name = "London Dreams";
        obj.rating = 10;
        obj.moneyCollection = 9000000;
        obj.profit = 70000000;
        obj.leadActor = "Salman Khan";
        obj.leadActress = "Asin";
        obj.views = 10000;
        obj.likes = 500;
        
        obj.displayRating();
    }
}