import java.io.*;
import java.util.*;

class youtubeVideo{
    String song;
    String artist;
    int views;
    int likes;
    int releasedYear;
    int n; 
    ArrayList<String> comments;
    
    youtubeVideo(String song,String artist,int views, int likes){
        this.song=song;
        this.artist=artist;
        this.views=views;
        this.likes=likes;
        System.out.println("The song has just released");
    }
    youtubeVideo(String song,String artist,int views, int likes,int releasedYear){
        this.song=song;
        this.artist=artist;
        this.views=views;
        this.likes=likes;
        this.releasedYear=releasedYear;
        System.out.println("The song was released in " + releasedYear);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
            String song = scn.nextLine();
            String artist = scn.nextLine();
            int views = scn.nextInt();
            int likes = scn.nextInt();
            int releasedYear = scn.nextInt();
            int n = scn.nextInt();
            scn.nextLine();

            ArrayList<String> comments = new ArrayList<>();
            for(int j=0; j<n; j++){
                String comm = scn.nextLine();
                comments.add(comm);
            }
        
            int k = scn.nextInt();
        
            if(k==1){
                youtubeVideo obj = new youtubeVideo(song,artist,views,likes);
            }else{
                youtubeVideo obj = new youtubeVideo(song,artist,views,likes,releasedYear);
            }
    }
}