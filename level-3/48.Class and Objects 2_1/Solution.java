import java.io.*;
import java.util.*;

class InstaInfluencer{
    String name;
    int totalPosts;
    int totalReels;
    String blueTick;
    int followers;
    int following;
    String category;
    char gender;
    
    InstaInfluencer(String n,int tp, int tr, String bt, int flwrs, int flwngs, String cat, char gen){
        this.name=n;
        this.totalPosts=tp;
        this.totalReels=tr;
        this.blueTick=bt;
        this.followers=flwrs;
        this.following=flwngs;
        this.category=cat;
        this.gender=gen;
    }
    
    public void printDetails(){
        System.out.println(name);
        System.out.println(totalPosts);
        System.out.println(totalReels);
        System.out.println(blueTick);
        System.out.println(followers);
        System.out.println(following);
        System.out.println(category);
        System.out.println(gender);                   
    }
}

public class Solution {

    public static void main(String[] args) {
        InstaInfluencer RaftaarMusic = new InstaInfluencer("Raftaar",340,400,"Yes",7,200,"Rapper",'M');
        InstaInfluencer RachelGupta = new InstaInfluencer("Rachel Gupta",550,350,"Yes",15,10,"Artist",'M');
        InstaInfluencer NikhilChinapa = new InstaInfluencer("Nikhil Chinapa",500,220,"Yes",5,210,"VJ",'M');
        InstaInfluencer BaseerBob = new InstaInfluencer("Baseer",500,120,"No",2,230,"VJ",'M');
        
        RaftaarMusic.printDetails();
        RachelGupta.printDetails();
        NikhilChinapa.printDetails();
        BaseerBob.printDetails();
    }
}