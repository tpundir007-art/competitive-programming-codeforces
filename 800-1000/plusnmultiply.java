//479A..insert + and * to get max result

import java.util.Scanner;

public class plusnmultiply 
{
    public static void main(String[] args) 
    {
        Scanner so=new Scanner(System.in);
        int a=so.nextInt();
        int b=so.nextInt();
        int c=so.nextInt();
        
        int max=Math.max(a+b*c,a*(b+c));
        max=Math.max(max,a*b*c);
        max=Math.max(max,(a+b)*c);
        max=Math.max(max,(a+b+c));
        
        
        System.out.println(max);
        so.close();
    }
    
}
