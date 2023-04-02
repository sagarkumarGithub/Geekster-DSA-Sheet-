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
        System.out.println("This is the function of movies class.");
    }
}

class commercialMovies extends movies{
    
}

public class Solution {

    public static void main(String[] args) {
        commercialMovies obj = new commercialMovies();
        obj.name = "londonDreams";
        obj.rating = 10;
        obj.moneyCollection = 9000;
        obj.profit = 8850;
        obj.leadActor = "Rannvijay Singha, Rachel Gupta, Prince Narula";
        obj.leadActress = "Prajakta";
        
        System.out.println(obj.moneyCollection);
        System.out.println(obj.profit);
        System.out.println(obj.leadActor);
        obj.displayRating();
    }
}