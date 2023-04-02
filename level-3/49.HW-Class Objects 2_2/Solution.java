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
        
        InstaInfluencer obj = new InstaInfluencer();
        obj.name = scn.nextLine();
        obj.totalPosts = scn.nextInt();
        obj.totalReels = scn.nextInt();
        obj.blueTick = scn.nextBoolean();
        obj.followers = scn.nextInt();
        obj.following = scn.nextInt();
        obj.category = scn.next();
        obj.gender = scn.next().charAt(0);
        
        obj.printDetails();
    }
}