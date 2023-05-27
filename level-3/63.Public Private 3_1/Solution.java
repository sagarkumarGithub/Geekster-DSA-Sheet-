import java.io.*;
import java.util.*;

class youtubeVideo{
    public String song;
    public String artist;
    public int views;
    public int likes;
    public int releasedYear;
    public int commentCount; //n
    ArrayList<String> comments;
    
    private int impressions;
    
    youtubeVideo(String s,String a, int v, int l, int yr, int n, ArrayList<String> comm, int imp){
        this.song=s;
        this.artist=a;
        this.views=v;
        this.likes=l;
        this.releasedYear=yr;
        this.commentCount=n;
        this.comments=comm;
        this.impressions=imp;
    }
    
    public void getImpressions(){
        System.out.println(impressions);
    }
    
    private int calculateRank(){
        int rank = likes + impressions;
        
        if(rank > 10000)
            return 1;
        else if(rank > 5000)
            return 2;
        else if(rank > 1000)
            return 3;
        else if(likes == 0)
            return 4;
        
        return 0;
    }
    
    public void printRank(){
        int rank = calculateRank();
        System.out.println(rank);
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
        int commentCount = scn.nextInt(); // n
        scn.nextLine();
        ArrayList<String> comments = new ArrayList<>();
        for(int i=0; i<commentCount; i++){
            String s = scn.nextLine();
            comments.add(s);
        }
        int impressions = scn.nextInt();
        
        youtubeVideo obj = new youtubeVideo(song,artist,views,likes,releasedYear,commentCount,comments,impressions);
        
        obj.getImpressions();
        obj.printRank();
    }
}
