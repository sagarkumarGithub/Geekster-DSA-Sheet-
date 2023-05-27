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
    
    youtubeVideo(String song,String artist,int views, int likes,int releasedYear,int n, ArrayList<String> comments){
        this.song=song;
        this.artist=artist;
        this.views=views;
        this.likes=likes;
        this.releasedYear=releasedYear;
        this.n=n;
        this.comments=comments;
    }
    
    public void printInfoYV(){
        System.out.println(song);
        System.out.println(artist);
        System.out.println(views);
        System.out.println(likes);
        System.out.println(releasedYear);
        System.out.println(n);
        for(String ele:comments){
            System.out.println(ele);
        }
    }
}

class shortVideos extends youtubeVideo{
    int time;
    int impressions;
    
    shortVideos(String song,String artist,int views, int likes,int releasedYear,int n, ArrayList<String> comments,int time, int impressions){
        super(song,artist,views,likes,releasedYear,n,comments);
        this.time=time;
        this.impressions=impressions;
    }
    
    public void printInfoSV(){
        System.out.println(time);
        System.out.println(impressions);
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
        
        int time = scn.nextInt();
        int impressions = scn.nextInt();
        
        shortVideos obj = new shortVideos(song,artist,views,likes,releasedYear,n,comments,time,impressions);
        obj.printInfoYV();
        obj.printInfoSV();
    }
}