import java.io.*;
import java.util.*;

class youtubeVideo{
    String song;
    String artist;
    int views;
    int likes;
    int releasedYear;
    int n; 
    static int totalVideos=0;
    ArrayList<String> comments;
    
    youtubeVideo(String song,String artist,int views, int likes,int releasedYear,int n, ArrayList<String> comments){
        this.song=song;
        this.artist=artist;
        this.views=views;
        this.likes=likes;
        this.releasedYear=releasedYear;
        this.n=n;
        this.comments=comments;
        totalVideos++;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        
        for(int i=0; i<t; i++){
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
            youtubeVideo obj = new youtubeVideo(song,artist,views,likes,releasedYear,n,comments);
        }
        
        System.out.println(youtubeVideo.totalVideos);
    }
}
