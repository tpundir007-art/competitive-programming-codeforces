
//1527A
import java.util.*;
public class bitwiseand 
{
    public static void main(String[] args) 
    {
        Scanner so=new Scanner(System.in);
        int t=so.nextInt();
        while(t-->0)
        {   
            int n=so.nextInt();
            int k=Integer.highestOneBit(n);
            System.out.println(k-1);
            so.close();
        }
    }
}

