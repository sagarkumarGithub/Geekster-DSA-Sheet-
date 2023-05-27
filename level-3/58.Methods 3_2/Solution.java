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
    
    public void setProp(String song,String artist,int views, int likes,int releasedYear,int n, ArrayList<String> comments){
        this.song=song;
        this.artist=artist;
        this.views=views;
        this.likes=likes;
        this.releasedYear=releasedYear;
        this.n=n;
        this.comments=comments;
    }
    
    public void getProp(){
        System.out.println(song);
        System.out.println(artist);
        System.out.println(views);
        System.out.println(likes);
        System.out.println(releasedYear);
        System.out.println(n);
        
        for(String ele : comments){
            System.out.println(ele);
        }
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
        for(int i=0; i<n; i++){
            String comm = scn.nextLine();
            comments.add(comm);
        }
         
        youtubeVideo obj = new youtubeVideo();
        obj.setProp(song,artist,views,likes,releasedYear,n,comments);
        obj.getProp();
    }
}
