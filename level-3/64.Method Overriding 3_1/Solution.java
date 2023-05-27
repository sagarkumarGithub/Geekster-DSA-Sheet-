import java.io.*;
import java.util.*;

class youtubeVideo{
    String song;
    String artist;
    int views;
    int likes; 
    int releasedYear;
    ArrayList<String> comments;
    
    public void printTempRank(){
        System.out.println("Method of youtubeVideo class. Also can not find the rank right now.");
    }
}

class shortVideo extends youtubeVideo{
    
}

public class Solution {

    public static void main(String[] args) {
        shortVideo obj = new shortVideo();
        obj.printTempRank();
    }
}
