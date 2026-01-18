//451A
import java.util.*;
public class intersectiongame 
{
    public static void main(String[] args) 
    {
        Scanner so= new Scanner(System.in);
        int n=so.nextInt();
        int m=so.nextInt();
        if(Math.min(n,m)%2==0)
            System.out.println("Malvika");
        else
            System.out.println("Akshat");
        so.close();
        
    }
    
}
