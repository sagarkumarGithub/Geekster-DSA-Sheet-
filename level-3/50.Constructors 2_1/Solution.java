import java.io.*;
import java.util.*;

class InstaInfluencer{
    String name;
    int totalPosts;
    int totalReels;
    boolean blueTick;
    int followers;
    int following;
    String category;
    char gender;
    
    InstaInfluencer(String n,int tp, int tr, boolean bt, int flwrs, int flwngs, String cat, char gen){
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
        Scanner scn = new Scanner(System.in);
        
        String name = scn.nextLine();
        int totalPosts = scn.nextInt();
        int totalReels = scn.nextInt();
        boolean blueTick = scn.nextBoolean();
        int followers = scn.nextInt();
        int following = scn.nextInt();
        String category = scn.next();
        char gender = scn.next().charAt(0);
        
        InstaInfluencer obj = new InstaInfluencer(name,totalPosts,totalReels,blueTick,followers,following,category,gender);
        
        obj.printDetails();
    }
}