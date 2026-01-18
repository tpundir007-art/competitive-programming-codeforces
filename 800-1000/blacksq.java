//431A
//https://codeforces.com/contest/431/problem/A
//finding how many calories will jury burn to destroy all the squares
import java.util.Scanner;

public class blacksq 
{
    public static void main(String[] args) 
    {
        Scanner so= new Scanner(System.in);
        int a[]=new int[4];
        for(int i=0;i<4;i++)
        {
            a[i]=so.nextInt();
        }
        String s=so.next();

        char ch[]=s.toCharArray();
        int cal=0;
        for(char c: ch)
        {
            int i=c-'1';
            cal+=a[i];
        }
        System.out.println(cal);
        so.close();
        
    }
    
}
