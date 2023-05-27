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
    
    public void add(int x){
        this.views += x;
        System.out.println("Views are added");
        System.out.println(this.views);
        System.out.println(this.likes);
    }
    
    public void add(int x,int y){
        this.views += x;
        this.likes += y;
        System.out.println("Views and likes are added");
        System.out.println(this.views);
        System.out.println(this.likes);
    }
    
    youtubeVideo(String song,String artist,int views, int likes,int year,int n,ArrayList<String> comments){
        this.song=song;
        this.artist=artist;
        this.views=views;
        this.likes=likes;
        this.releasedYear=year;
        this.n=n;
        this.comments=comments;
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
        
            youtubeVideo obj = new youtubeVideo(song,artist,views,likes,releasedYear,n,comments);
            int k = scn.nextInt();
        
            if(k==1){
                int x = scn.nextInt();
                obj.add(x);
            }else{
                int x = scn.nextInt();
                int y = scn.nextInt();
                obj.add(x,y);
            }
    }
}
